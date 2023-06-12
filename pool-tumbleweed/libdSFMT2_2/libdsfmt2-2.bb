SUMMARY = "Double precision SIMD-oriented Fast Mersenne Twister"
DESCRIPTION = "Double precision SIMD-oriented Fast Mersenne Twister (dSFMT) \
 \
The purpose of dSFMT is to speed up the generation by avoiding the expensive \
conversion of integer to double (floating point). dSFMT directly generates \
double precision floating point pseudorandom numbers which have the IEEE \
Standard for Binary Floating-Point Arithmetic (ANSI/IEEE Std 754-1985) format. \
dSFMT is only available on the CPUs which use IEEE 754 format double \
precision floating point numbers."
LICENSE = "BSD-3-Clause"

PV = "2.2.5"

RPM_NAME = "libdSFMT2_2-2.2.5-1.8.aarch64.rpm"
RPM_HASH = "ca148c212ca51fcd745aa7dd9336b263324a5f50d51d46bb4cd019f873a9f6e0fb1707fe35eff706336b3c99c120160479d4e98dd06ef9dc5d3e5e62759dedc2"

RPROVIDES:${PN} += "libdSFMT.so.2.2()(64bit) \
libdSFMT2_2 \
libdSFMT2_2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
