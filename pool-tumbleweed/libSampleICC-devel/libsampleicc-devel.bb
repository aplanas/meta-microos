SUMMARY = "Headers, Configuration and static Libs + Documentation"
DESCRIPTION = "Header files, libraries and documentation for development of Color Management \
applications."
LICENSE = "BSD-3-Clause"

PV = "1.6.8"

RPM_NAME = "libSampleICC-devel-1.6.8-4.9.aarch64.rpm"
RPM_HASH = "7c78db84f6bd752f518b2f4360c7d747fa230036577d9bc4e4594414d9639346bf75b5ea818baec3962d89295d9e6c5fc90b1e1356a260609e4ab6e29acd0fe4"

RPROVIDES:${PN} += "libSampleICC-devel \
pkgconfig-sampleicc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSampleICC2"

inherit rpm
