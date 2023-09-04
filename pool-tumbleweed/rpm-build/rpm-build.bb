SUMMARY = "Tools and Scripts to create rpm packages"
DESCRIPTION = "If you want to build a rpm, you need this package. It provides rpmbuild \
and requires some packages that are usually required."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "rpm-build-4.18.0-6.1.aarch64.rpm"
RPM_HASH = "ce82dece3519b809407daf4645eff2bd936c242115ebff743f80e3da52a290a67c87be81b1407d6649207b9e8462110a26eb3452fea5498f8d8c21ce49b5a7eb"

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
