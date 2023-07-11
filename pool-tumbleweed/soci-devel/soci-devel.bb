SUMMARY = "Development files for soci"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
The soci development package includes the header files, libraries, \
development tools necessary for compiling and linking applications \
which will use soci."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "soci-devel-4.0.2-4.5.aarch64.rpm"
RPM_HASH = "83189f550eeed9950843a31d59fe07086d17535d0f45f9ee7f94ac70a31e80938d8c3796b743cf1acbd6bcbae76ef765fcc122c08d52870d0f9377b2623a3a8f"

RPROVIDES:${PN} += "cmake-SOCI \
soci-devel"

RDEPENDS:${PN} += "libboost-headers-devel \
libsoci-core4-0"

inherit rpm
