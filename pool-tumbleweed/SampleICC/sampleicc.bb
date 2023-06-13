SUMMARY = "Color Management System"
DESCRIPTION = "SampleICC is a C++ library for reading, writing, manipulating, and \
applying ICC profiles along with applications that make use of this \
library."
LICENSE = "BSD-3-Clause"

PV = "1.6.8"

RPM_NAME = "SampleICC-1.6.8-4.8.aarch64.rpm"
RPM_HASH = "44ed198bee22f21384194ddd8cc47428393f055583d398352bb44d70556003b184af9b2d15681d9451e66c83257e66211b0c1f0c06f63a65236cd9fff2b933f4"

RPROVIDES:${PN} += "SampleICC \
SampleICC(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libICC_utils.so.2()(64bit) \
libSampleICC.so.2()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libtiff.so.6()(64bit)"

inherit rpm
