SUMMARY = "Package provides recommended R-rpart"
DESCRIPTION = "This packages provides R-rpart, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.1.19"

RPM_NAME = "R-rpart-4.1.19-45.1.aarch64.rpm"
RPM_HASH = "e09601c8d170b1ef8de43f92200969e1f4ba61184ca91ac9ffb12552b9c8c42bfe84131db2364794597c4ce531c21aab9ce02ef2027c1566294b656f0ce87fda"

RPROVIDES:${PN} += "R-rpart R-rpart(aarch-64)"
RDEPENDS:${PN} += "R-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libR.so()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
