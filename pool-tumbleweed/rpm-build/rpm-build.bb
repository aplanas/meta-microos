SUMMARY = "Tools and Scripts to create rpm packages"
DESCRIPTION = "If you want to build a rpm, you need this package. It provides rpmbuild \
and requires some packages that are usually required."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "rpm-build-4.18.0-5.3.aarch64.rpm"
RPM_HASH = "1baaec46e892de8a408e994edd6789065b925c3f3de3ef8fd02e212a43a372e5397c0cbc2232a82fa0beac1b77d56e11857b93bbf33b54a4af6a094844b52857"

RPROVIDES:${PN} += "rpm-/usr/bin/rpmbuild \
rpm-build \
rpmbuild"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/gzip \
/usr/bin/sh \
binutils \
bzip2 \
coreutils \
cpio \
debugedit \
diffutils \
dwz \
file \
findutils \
gawk \
gcc \
gettext-tools \
glibc-devel \
glibc-locale-base \
grep \
ld-linux-aarch64.so.1 \
libc.so.6 \
libelf.so.1 \
libpopt.so.0 \
librpm.so.9 \
librpmbuild.so.9 \
librpmbuild9 \
librpmio.so.9 \
make \
patch \
rpm \
sed \
systemd-rpm-macros \
tar \
util-linux \
which \
xz"

inherit rpm
