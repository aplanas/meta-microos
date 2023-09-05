SUMMARY = "GNU Modula-2 Compiler"
DESCRIPTION = "This package contains a Modula-2 compiler."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "gcc13-m2-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "60320e5fb01c65f8468386dd28357737e7a4d479e7d4e9a22740a21301df84c92a2e94bb7f6b5233ea2098e98bed61c4c2646c93c73a91c4b3ce7a6123bab4bf"

RPROVIDES:${PN} += "gcc13-m2"

RDEPENDS:${PN} += "gcc13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm2cor18 \
libm2iso18 \
libm2log18 \
libm2min18 \
libm2pim18 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
