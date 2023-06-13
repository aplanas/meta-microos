SUMMARY = "Colour Management System Libraries"
DESCRIPTION = "SampleICC is a C++ library for reading, writing, manipulating, and \
applying ICC profiles along with applications that make use of this \
library."
LICENSE = "BSD-3-Clause"

PV = "1.6.8"

RPM_NAME = "libSampleICC2-1.6.8-4.8.aarch64.rpm"
RPM_HASH = "19b7773fcb0a6729e1c00dab90acd0e6c7b65eaa87fd30f1b7e4f6dc647bc17fedaa8965212542471bc9afb1365e601b9c2877150a77316b1d7804f410a2d2a9"

RPROVIDES:${PN} += "libICC_utils.so.2()(64bit) \
libSampleICC.so.2()(64bit) \
libSampleICC2 \
libSampleICC2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
