SUMMARY = "Fixed-point math operations library"
DESCRIPTION = "fixmath is a fixed-point math operations library written in C and \
implementing the Q16.16 format."
LICENSE = "MIT"

PV = "2022.07.20"

RPM_NAME = "fixmath-2022.07.20-6.1.aarch64.rpm"
RPM_HASH = "4e6bd05793be7027448ffff3e475a7f895cc2e3ef9a1f2488bbc49382b03f4ce52c2dc8850de8760887d0089f66bac91a1af8a5a0d86853139a89af551ae81cc"

RPROVIDES:${PN} += "fixmath \
libfixmath.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
