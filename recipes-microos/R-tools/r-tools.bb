SUMMARY = "Package providing R-tools"
DESCRIPTION = "This package provides R-tools, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-tools-4.3.0-45.1.aarch64.rpm"
RPM_HASH = "f69cf775f0a08a4e8e54165632154b6dc4d10e1df355ade77037352a4d040d73225d9b662c8060e4bea1b1efa1fa6ac16684496e29ad46eecf5c6c0d6cbcf37e"

RPROVIDES:${PN} += "R-tools R-tools(aarch-64)"
RDEPENDS:${PN} += "R-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libR.so()(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
