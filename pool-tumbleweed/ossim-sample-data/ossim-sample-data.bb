SUMMARY = "OSSIM data samples files"
DESCRIPTION = "The OSSIM data samples files for tests."
LICENSE = "LGPL-3.0-only"

PV = "2.11.1"

RPM_NAME = "ossim-sample-data-2.11.1-1.21.aarch64.rpm"
RPM_HASH = "b094c11c8b2e4a23225b861adfb224ae2386ae613f18b5c6a11582a6f627da3d7ea9eb01ed7a1be7e277e3c1a3885d6b5ee4e5dd62a113bc31e46ec3dd160541"

RPROVIDES:${PN} += "ossim-sample-data"

RDEPENDS:${PN} += ""

inherit rpm
