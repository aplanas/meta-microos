SUMMARY = "Manual for nanoxml"
DESCRIPTION = "Documentation for nanoxml, a small non-validating XML parser."
LICENSE = "Zlib"

PV = "2.2.3"

RPM_NAME = "nanoxml-manual-2.2.3-4.6.noarch.rpm"
RPM_HASH = "4650bf15449f65e339100962519dec73c5ac903aa337a3b1418a7e2b584905665bb4c12d9300cc54ee4d03412168ee5cbfc9e9f7375d9ec4a663345198b4dd73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nanoxml-manual"

RDEPENDS:${PN} += ""

inherit rpm
