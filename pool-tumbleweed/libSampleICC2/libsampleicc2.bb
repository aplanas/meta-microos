SUMMARY = "Colour Management System Libraries"
DESCRIPTION = "SampleICC is a C++ library for reading, writing, manipulating, and \
applying ICC profiles along with applications that make use of this \
library."
LICENSE = "BSD-3-Clause"

PV = "1.6.8"

RPM_NAME = "libSampleICC2-1.6.8-4.9.aarch64.rpm"
RPM_HASH = "388e1ac52d72a3bb7f04e92bb93d95ec29c97cb6760b8a95726a8bdb712e6784ff7d80ab0b884b5a148302f262d3367b051989908ba0d0ecfd5ad3b40ae40939"

RPROVIDES:${PN} += "libICC-utils.so.2 \
libSampleICC.so.2 \
libSampleICC2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
