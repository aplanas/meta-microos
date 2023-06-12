SUMMARY = "Toolchain building framework"
DESCRIPTION = "crosstool-NG aims at building toolchains. Toolchains are an essential component \
in a software development project. It will compile, assemble and link the code \
that is being developed. Some pieces of the toolchain will eventually end up \
in the resulting binary/ies: static libraries are but an example."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-or-later & LGPL-2.1-only & LGPL-3.0-or-later"

PV = "1.25.0"

RPM_NAME = "crosstool-ng-1.25.0-1.3.aarch64.rpm"
RPM_HASH = "59fdc2ad3c6a4655f94b967fc6520e9b521204e62c6efbf2569e1bf80130d3a8f3de170b1df0faf200ef33be3a0db592c0190fa8c1284b03e54b170c0786fbcb"

RPROVIDES:${PN} += "crosstool-ng \
crosstool-ng(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/gmake \
bzip2 \
gcc \
gcc-c++ \
glibc-devel-static \
gzip \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmenuw.so.6()(64bit) \
libmenuw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libpanelw.so.6()(64bit) \
libpanelw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
m4 \
wget \
xz"

inherit rpm
