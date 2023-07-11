SUMMARY = "Symbol versioning helper (Documentation)"
DESCRIPTION = "Documentation for the symbol versioning helper python39-abimap"
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python39-abimap-doc-0.3.2-3.12.noarch.rpm"
RPM_HASH = "d1a990014fa641fab1e8acc8c46c5e9b34f6d1a6c3419a7bd7ad47a8fdcf1f83d458f043c336db7e93a480f1c171b486390c8455d1d1c8cc8486f83da8b8282a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-abimap-doc"

RDEPENDS:${PN} += ""

inherit rpm
