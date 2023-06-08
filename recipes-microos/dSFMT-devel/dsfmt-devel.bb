SUMMARY = "Double precision SIMD-oriented Fast Mersenne Twister"
DESCRIPTION = "Double precision SIMD-oriented Fast Mersenne Twister (dSFMT) \
 \
The purpose of dSFMT is to speed up the generation by avoiding the expensive \
conversion of integer to double (floating point). dSFMT directly generates \
double precision floating point pseudorandom numbers which have the IEEE \
Standard for Binary Floating-Point Arithmetic (ANSI/IEEE Std 754-1985) format. \
dSFMT is only available on the CPUs which use IEEE 754 format double \
precision floating point numbers. \
 \
This package provides libraries and header files for developing applications \
that use dSFMT."
LICENSE = "BSD-3-Clause"

PV = "2.2.5"

RPM_NAME = "dSFMT-devel-2.2.5-1.8.aarch64.rpm"
RPM_HASH = "c5f1979355cb8998b0068e3c691df561dcf44cf68575f8d88500bf7774684663eda78b4626980dd7ad549eae2234622bb7f6670bd6e7d66cd6fd3dfd9d2d52d7"

RPROVIDES:${PN} += "dSFMT-devel dSFMT-devel(aarch-64)"
RDEPENDS:${PN} += "libdSFMT2_2"

inherit rpm
