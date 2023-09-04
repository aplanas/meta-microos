SUMMARY = "Development files for libuuid"
DESCRIPTION = "Files to develop applications using the library to generate universally \
unique IDs (UUIDs)."
LICENSE = "BSD-3-Clause"

PV = "2.39.1"

RPM_NAME = "libuuid-devel-static-2.39.1-3.1.aarch64.rpm"
RPM_HASH = "070a60ec757be2a35b26c7165d9efed45da44af1c5a04133faac1333e71e917bfe447c57ccd214b4b798245dd70f01a20b7158af2ee05fc8c0ca060f00df80f1"

RPROVIDES:${PN} += "libuuid-devel-static"

RDEPENDS:${PN} += "libuuid-devel"

inherit rpm
