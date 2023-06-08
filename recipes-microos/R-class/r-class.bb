SUMMARY = "Package provides recommended R-class"
DESCRIPTION = "This packages provides R-class, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "7.3.21"

RPM_NAME = "R-class-7.3.21-45.1.aarch64.rpm"
RPM_HASH = "3e40d05e61fe99329b7e8a38226e38d7f1d3077f46cbb6aec0b61090150f8ada79ff948fcd7c336e8498912c8b756bd88fdaaa2d44e90e3f38196682f143fc85"

RPROVIDES:${PN} += "R-class R-class(aarch-64)"
RDEPENDS:${PN} += "R-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libR.so()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
