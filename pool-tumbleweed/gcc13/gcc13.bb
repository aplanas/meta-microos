SUMMARY = "The GNU C Compiler and Support Files"
DESCRIPTION = "Core package for the GNU Compiler Collection, including the C language \
frontend. \
 \
Language frontends other than C are split to different sub-packages, \
namely gcc-ada, gcc-c++, gcc-fortran, gcc-obj, gcc-obj-c++, gcc-go, \
gcc-rust and gcc-m2."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "gcc13-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "6c9f85d967c29235fa7ae8688a8f91c1b037c7a49821b4354508d1293e562da60e8545e55370ec6be6b31f09b0ddee8eb08635f6cc8c3a1fa003a721ad3f39fa"

RPROVIDES:${PN} += "gcc13 \
liblto-plugin.so"

RDEPENDS:${PN} += "binutils \
cpp13 \
glibc-devel \
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
