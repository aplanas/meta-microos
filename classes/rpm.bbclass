REPO_URL ?= "https://download.opensuse.org/ports/aarch64/tumbleweed/repo/oss"
# This part correspond to the last bit of the repository URL.  Possibe
# values are "aarch64", "noarch"
REPO_ARCH ?= "aarch64"

SRC_URI = "${REPO_URL}/${REPO_ARCH}/${RPM_NAME};subdir=unrpm"
SRC_URI[sha512sum] = "${RPM_HASH}"

S = "${WORKDIR}/unrpm"

# Remove pkgconfig from RDEPENDS.  One option is to do that during the
# ".bb" generation (microos script). See providers.inc.
RDEPENDS:${PN}:remove = "pkgconfig"

# Drop subpackages, as defined in bitbake.conf
PACKAGES = "${PN}"
FILES:${PN} = "/*"

# QA complains that binaries are already stripped
INSANE_SKIP:${PN} += "already-stripped"

# Prevents the default dependencies (like glibc) to be automatically
# added to DEPENDS
INHIBIT_DEFAULT_DEPS = "1"

# Make sure that sysroot gets deployed with all relevant directories.
# Do not include ${base_libdir}64, as this is converted as a directory
# by the filesystem package, and the link should be created as a
# preparation task in the glibc recipe.
SYSROOT_DIRS += "${libdir}64"

# Also includes the source directory, for kernel development
SYSROOT_DIRS += "${exec_prefix}/src"

do_install () {
    cp -a ${S}/* ${D}
    # The fetch task calls rpm2cpio.sh under the normal user.  Should
    # be set to root (via fakeroot) to avoid QA complains
    chown -R root:root ${D}/*
}

do_package_write_rpm () {
    # Copy the original RPM into deploy-rpm instead of generating a
    # new open based on the install task.  Do not avoid the package
    # task, as this is the one that creates the sstage data
    cp ${DL_DIR}/${RPM_NAME} ${PKGWRITEDIRRPM}/${PACKAGE_ARCH_EXTEND}
}

do_compile[noexec] = "1"
do_package_qa[noexec] = "1"
do_populate_lic[noexec] = "1"
