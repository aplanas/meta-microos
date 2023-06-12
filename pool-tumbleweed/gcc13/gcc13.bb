SUMMARY = "The GNU C Compiler and Support Files"
DESCRIPTION = "Core package for the GNU Compiler Collection, including the C language \
frontend. \
 \
Language frontends other than C are split to different sub-packages, \
namely gcc-ada, gcc-c++, gcc-fortran, gcc-obj, gcc-obj-c++, gcc-go, \
gcc-rust and gcc-m2."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "gcc13-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "f8335b5a1676617f1450f3d80734bfc6075e7ac482f5b17ce7b6fdb85c76f5abb321cb091016d85f1e54e9b515e17e645361617750e44297e96f2eca6aca717a"

RPROVIDES:${PN} += "gcc13 \
gcc13(aarch-64) \
liblto_plugin.so()(64bit)"
RDEPENDS:${PN} += "binutils \
cpp13 \
glibc-devel \
libasan8 \
libatomic1 \
libc.so.6(GLIBC_2.36)(64bit) \
libgcc_s1 \
libgmp.so.10()(64bit) \
libgomp1 \
libhwasan0 \
libisl.so.23()(64bit) \
libitm1 \
liblsan0 \
libmpc.so.3()(64bit) \
libmpfr.so.6()(64bit) \
libtsan2 \
libubsan1 \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
