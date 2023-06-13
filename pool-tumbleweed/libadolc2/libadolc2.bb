SUMMARY = "Algorithmic Differentiation Library for C/C++"
DESCRIPTION = "ADOL-C (Automatic Differentiation by OverLoading in C++) facilitates \
the evaluation of first and higher derivatives of vector functions \
written in C or C++. The resulting derivative evaluation routines may \
be called from C/C++, Fortran, or any other language that can be \
linked with C. \
 \
The numerical values of derivative vectors are obtained free of \
truncation errors at a small multiple of the run time and randomly \
accessed memory of the given function evaluation program."
LICENSE = "EPL-1.0 | GPL-2.0-or-later"

PV = "2.7.2"

RPM_NAME = "libadolc2-2.7.2-2.3.aarch64.rpm"
RPM_HASH = "2d5850ff5311a80d1459ac4a7839e8fb4dd778d50ae4a117963294929d8fa19d504f44fead39c5e404035bf46d388cc294e1f8796f66e53a6285420aedc74f16"

RPROVIDES:${PN} += "libadolc.so.2()(64bit) \
libadolc2 \
libadolc2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libColPack.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
