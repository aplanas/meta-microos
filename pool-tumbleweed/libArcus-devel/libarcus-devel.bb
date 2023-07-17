SUMMARY = "Header files for libArcus"
DESCRIPTION = "The libArcus-devel package includes the header files, libraries and development \
tools necessary for compiling and linking programs which use libArcus."
LICENSE = "LGPL-3.0-only"

PV = "4.13.1"

RPM_NAME = "libArcus-devel-4.13.1-4.2.aarch64.rpm"
RPM_HASH = "fd60891ef78348d6fd500ce2ef39b7c7a61e1b3588ab41966ceedded04e46797f73876f9104f76e566ec802059a1be54d39dab190c5542635648bad8319270bd"

RPROVIDES:${PN} += "cmake-Arcus \
libArcus-devel"

RDEPENDS:${PN} += "libArcus3 \
protobuf-devel \
python3-sip4-devel"

inherit rpm
