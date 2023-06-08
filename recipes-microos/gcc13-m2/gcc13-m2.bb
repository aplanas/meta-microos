SUMMARY = "GNU Modula-2 Compiler"
DESCRIPTION = "This package contains a Modula-2 compiler."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "gcc13-m2-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "d6913a1359ce2ca1eb053a1535c4cfc342aa7bc3e7fc8e38b2977962ec484a740b6e5c08f994e6e0d6e751b449f96f3c843445c29c83392dc20f8837206b8cf9"

RPROVIDES:${PN} += "gcc13-m2 gcc13-m2(aarch-64)"
RDEPENDS:${PN} += "gcc13 libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libisl.so.23()(64bit) libm2cor18 libm2iso18 libm2log18 libm2min18 libm2pim18 libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
