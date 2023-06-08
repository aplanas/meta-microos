SUMMARY = "Package providing R-utils"
DESCRIPTION = "This package provides R-utils, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-utils-4.3.0-45.1.aarch64.rpm"
RPM_HASH = "86b5e00132e169d7a4f894a982a64078c8c623e97b28ca1d4173bdb7270c1a4b22b0b70bab2ab0655c2f3ceec4adf2b6c7e6a6c757b330bd463a7d74982ca2f4"

RPROVIDES:${PN} += "R-utils R-utils(aarch-64)"
RDEPENDS:${PN} += "R-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libR.so()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
