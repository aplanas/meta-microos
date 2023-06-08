SUMMARY = "Package provides recommended R-survival"
DESCRIPTION = "This packages provides R-survival, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "3.5.5"

RPM_NAME = "R-survival-3.5.5-45.1.aarch64.rpm"
RPM_HASH = "0ab6c6c1524fc068013f0918e05c2318dd84d47362ac4c03dca734148b5866401be53e807de0f56f560cd69b46b2a9a79c148b9f2f9934a0645c508e74046814"

RPROVIDES:${PN} += "R-survival R-survival(aarch-64)"
RDEPENDS:${PN} += "R-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libR.so()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
