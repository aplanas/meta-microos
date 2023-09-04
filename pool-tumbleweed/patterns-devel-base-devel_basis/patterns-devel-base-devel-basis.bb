SUMMARY = "Base Development"
DESCRIPTION = "Minimal set of tools for compiling and linking applications."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-base-devel_basis-20170319-12.1.aarch64.rpm"
RPM_HASH = "e99fa368cf615647a5d50cc9ed9e247836e74af435120c04f3f4e4e8ea420085cd66288a4a22675d1c236ec44a5a8767f8d44ef12cdaa1798284e5cdfb1849f6"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-devel-base-devel-basis"

RDEPENDS:${PN} += "autoconf \
automake \
awk \
binutils \
bison \
cpp \
flex \
gcc \
gdbm-devel \
gettext-tools \
glibc-devel \
libtool \
m4 \
make \
makeinfo \
ncurses-devel \
patch \
pattern- \
zlib-devel"

inherit rpm
