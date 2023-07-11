SUMMARY = "CFD General Notation System library"
DESCRIPTION = "Files required to develop applications using CGNS (CFD General notation system)."
LICENSE = "Zlib"

PV = "4.3.0"

RPM_NAME = "cgns-devel-4.3.0-1.8.aarch64.rpm"
RPM_HASH = "44f8801457cad835554efdf86a442428cc6cbe8dec5ffd5952963504e7c5d184c31a0184686ea45f6e7ce604ba83bcd48f76d0ce2a0c42febf6b7ab65e9e4a2c"

RPROVIDES:${PN} += "cgns-devel \
libcgns-devel"

RDEPENDS:${PN} += "libcgns4-3"

inherit rpm
