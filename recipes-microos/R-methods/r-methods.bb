SUMMARY = "Package providing R-methods"
DESCRIPTION = "This package provides R-methods, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-methods-4.3.0-45.1.aarch64.rpm"
RPM_HASH = "2b4f2954b346058033e0e02d6bc8e0fb792e3f7803d577cd9d8913cff8e4412c341ca7e70edac3b612ac3a9047d7da4400d4afb9f52f854f02159ec94da4449b"

RPROVIDES:${PN} += "R-methods R-methods(aarch-64)"
RDEPENDS:${PN} += "R-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libR.so()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
