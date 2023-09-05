SUMMARY = "The GNU C Compiler and Support Files"
DESCRIPTION = "Core package for the GNU Compiler Collection, including the C language \
frontend. \
 \
Language frontends other than C are split to different sub-packages, \
namely gcc-ada, gcc-c++, gcc-fortran, gcc-obj, gcc-obj-c++, gcc-go, \
gcc-rust and gcc-m2."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "gcc13-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "9474a60b72bf5e09264fca9144571cf9f4bba3c4ca527eca4b5d589e6dfecd9d5d92ad075920b3fb38ad1fa77bfab871bfac80b41046f0ef3dbc3fd53c22e349"

RPROVIDES:${PN} += "gcc13 \
liblto-plugin.so"

RDEPENDS:${PN} += "binutils \
cpp13 \
glibc-devel \
ld-linux-aarch64.so.1 \
libasan8 \
libatomic1 \
libc.so.6 \
libgcc-s1 \
libgmp.so.10 \
libgomp1 \
libhwasan0 \
libisl.so.23 \
libitm1 \
liblsan0 \
libmpc.so.3 \
libmpfr.so.6 \
libtsan2 \
libubsan1 \
libz.so.1 \
libzstd.so.1"

inherit rpm
