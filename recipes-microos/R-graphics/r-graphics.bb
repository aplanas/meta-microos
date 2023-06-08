SUMMARY = "Package providing R-core graphics in R-graphics"
DESCRIPTION = "This package provides R-graphics, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-graphics-4.3.0-45.1.aarch64.rpm"
RPM_HASH = "5b278f3fea62035e34a17232fd4c01701724b5a89a7780f015f03573e95fdddae537ea8cf0f843abc26ab963968537f5c4c75d04e6e7565b126c51d6786af1ea"

RPROVIDES:${PN} += "R-graphics R-graphics(aarch-64)"
RDEPENDS:${PN} += "R-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libR.so()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
