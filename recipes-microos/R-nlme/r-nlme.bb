SUMMARY = "Package provides recommended R-nlme"
DESCRIPTION = "This packages provides R-nlme, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "3.1.162"

RPM_NAME = "R-nlme-3.1.162-45.1.aarch64.rpm"
RPM_HASH = "5d510a1d1731a4247c2f6ef3bda62f034069d94b85ebc30c64519992b38121c786b6f85b66448d612bd4f47db36457f8e79e59e48f9981b0a0f0aa1e2abdf331"

RPROVIDES:${PN} += "R-nlme R-nlme(aarch-64)"
RDEPENDS:${PN} += "R-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libR.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm
