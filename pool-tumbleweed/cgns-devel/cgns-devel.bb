SUMMARY = "CFD General Notation System library"
DESCRIPTION = "Files required to develop applications using CGNS (CFD General notation system)."
LICENSE = "Zlib"

PV = "4.3.0"

RPM_NAME = "cgns-devel-4.3.0-1.7.aarch64.rpm"
RPM_HASH = "ae8326483a97ee663d432233b6d8108f994f5874f164728a49e56424f8b873e1126a28a8f37fb66fb884c6dd1281345373bb7edb2669e2408f8edfb039eb9290"

RPROVIDES:${PN} += "cgns-devel \
libcgns-devel"

RDEPENDS:${PN} += "libcgns4-3"

inherit rpm
