SUMMARY = "Base Development"
DESCRIPTION = "Minimal set of tools for compiling and linking applications."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-base-devel_basis-20170319-11.2.aarch64.rpm"
RPM_HASH = "1c58cc954625be538c4f1f35530376f7113d89d79f16a5da1e6b9da090942e98ec7a93bf30393c991512071d06031988375efba9e448d8d6caa96fd1764ee1f3"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-devel-base-devel-basis"

RDEPENDS:${PN} += "autoconf \
automake \
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
