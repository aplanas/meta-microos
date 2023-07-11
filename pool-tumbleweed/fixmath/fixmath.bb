SUMMARY = "Fixed-point math operations library"
DESCRIPTION = "fixmath is a fixed-point math operations library written in C and \
implementing the Q16.16 format."
LICENSE = "MIT"

PV = "2022.07.20"

RPM_NAME = "fixmath-2022.07.20-5.2.aarch64.rpm"
RPM_HASH = "7ce3b3a8045367467f66b07f7ae304ce23f92686b24a6b227ba6f6eeed0f70da90ede87fef2af9189c0cd6033693c12006649428d36944f2bddfc70696172d1d"

RPROVIDES:${PN} += "fixmath \
libfixmath.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
