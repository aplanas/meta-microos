SUMMARY = "Package provides recommended R-MASS"
DESCRIPTION = "This packages provides R-MASS, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "7.3.58"

RPM_NAME = "R-MASS-7.3.58-45.1.aarch64.rpm"
RPM_HASH = "597c1c8aa31bb16d93bf31a0a6257cdb416eec8a1b3a4c384625335657109d308600913f106b2426f992f2c8aff9b75d79c5243e60aab51a5f5d209751e37d13"

RPROVIDES:${PN} += "R-MASS R-MASS(aarch-64)"
RDEPENDS:${PN} += "R-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libR.so()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
