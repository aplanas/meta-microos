SUMMARY = "Tools and Scripts to create rpm packages"
DESCRIPTION = "If you want to build a rpm, you need this package. It provides rpmbuild \
and requires some packages that are usually required."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "rpm-build-4.18.0-5.1.aarch64.rpm"
RPM_HASH = "20d6913170fe83be9680c36926709313dde6ae473d8b909b212e8c92e1e7bb1caf6a455fb01f5020866edb351171ee30e65ece5533713b3c67eeb3175109e5cf"

RPROVIDES:${PN} += "rpm-/usr/bin/rpmbuild \
rpm-build \
rpmbuild"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/gzip \
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
