SUMMARY = "Library for linear arithmetic over GF(2^e)"
DESCRIPTION = "M4RIE is a library for arithmetic with dense matrices over the \
Galois Field GF(2^e)."
LICENSE = "GPL-2.0-or-later"

PV = "20200125"

RPM_NAME = "libm4rie-0_0_20200125-20200125-1.2.aarch64.rpm"
RPM_HASH = "751f3d6f7234a8c5f96933cf9f635d1078847100343a97062128df338497cd1a8357bd7af3383935911849303bed4f2e7ad5cedc830aae5d70a848d641cbdf5f"

RPROVIDES:${PN} += "libm4rie-0.0.20200125.so()(64bit) \
libm4rie-0_0_20200125 \
libm4rie-0_0_20200125(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm4ri-0.0.20200125.so()(64bit)"

inherit rpm
