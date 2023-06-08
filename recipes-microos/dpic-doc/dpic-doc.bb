SUMMARY = "Documentation for dpic"
DESCRIPTION = " \
This package contains the documentation for dpic."
LICENSE = "BSD-2-Clause & CC-BY-3.0"

PV = "2023.02.01"

RPM_NAME = "dpic-doc-2023.02.01-1.3.noarch.rpm"
RPM_HASH = "b79a79b708c20d5b09eb3010d13a1c71ed86401ece8e43b5712f7894d18daf5957e692aa2d5eeba00448d3c4813138e43ea8f38db968a0db5b0231aeeba2b5f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dpic-doc"
RDEPENDS:${PN} += "dpic"

inherit rpm
