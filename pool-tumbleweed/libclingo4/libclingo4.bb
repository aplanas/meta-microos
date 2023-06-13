SUMMARY = "Libraries file(s) for clingo"
DESCRIPTION = "Clingo is part of the Potassco project for Answer Set Programming \
(ASP). This package include clingo libraries."
LICENSE = "MIT"

PV = "5.6.2"

RPM_NAME = "libclingo4-5.6.2-1.3.aarch64.rpm"
RPM_HASH = "6349b7f4e88493bf10e14bf800ba3ca57af751641bea09dc1cfb0e2952030ef123bfc6ad16d9e87b58938a12890c603de202d44498f54788df01a4f4032373d0"

RPROVIDES:${PN} += "libclingo.so.4()(64bit) \
libclingo4 \
libclingo4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
