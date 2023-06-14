SUMMARY = "Development files for the soci empty back-end"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
The soci development package includes the header files, libraries, \
development tools necessary for compiling and linking applications \
which will use soci with an empty back-end."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "soci-empty-devel-4.0.2-4.4.aarch64.rpm"
RPM_HASH = "bdc43126b028b2e782b98a5ffd5f9c7e5369cf7e10ceae1d7d5cac800db39b3722a1f8cb36a66e2c3828bc4c3f2c9d09ec859a09e594cf33a76468a57e4fcfe2"

RPROVIDES:${PN} += "soci-empty-devel"

RDEPENDS:${PN} += "libsoci-empty4-0 \
soci-devel"

inherit rpm
