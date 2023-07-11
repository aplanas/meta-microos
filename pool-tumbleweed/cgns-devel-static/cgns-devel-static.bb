SUMMARY = "CFD General Notation System library"
DESCRIPTION = "Static CGNS (CFD General notation system) library."
LICENSE = "Zlib"

PV = "4.3.0"

RPM_NAME = "cgns-devel-static-4.3.0-1.8.aarch64.rpm"
RPM_HASH = "642bad52562858f6500a8dd279d028203badf81ed5f05b68b467ee8be696b07606271dae691c6388b09c5d4c4293f76d827485f28875a8d1a1feda4e45c9fab8"

RPROVIDES:${PN} += "cgns-devel-static"

RDEPENDS:${PN} += "cgns-devel"

inherit rpm
