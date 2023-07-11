SUMMARY = "Documentation files for the Open Path Guiding library"
DESCRIPTION = "Documentation files for the Open Path Guiding library."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "openpgl-doc-0.4.1-1.4.noarch.rpm"
RPM_HASH = "c8db85d0baf36884b7375ed17db6a8398a695178eadd428ab2a3f2a3bc3d523eec0fc43083fcb15806c62a849d6e61cf720d4a2dcc1d477fe8289c6299bb43ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openpgl-doc"

RDEPENDS:${PN} += ""

inherit rpm
