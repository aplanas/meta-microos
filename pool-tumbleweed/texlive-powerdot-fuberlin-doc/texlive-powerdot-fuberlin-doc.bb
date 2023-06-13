SUMMARY = "Documentation for texlive-powerdot-fuberlin"
DESCRIPTION = "This package includes the documentation for texlive-powerdot-fuberlin"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02asvn52922"

RPM_NAME = "texlive-powerdot-fuberlin-doc-2023.201.0.0.02asvn52922-52.1.noarch.rpm"
RPM_HASH = "d9b133d23c530403604203cf99047907995331e0ecbaad428d8fc19dba5cd595e5dcc1d93df09130a215ccd0bdc64362b3e1d54a4d303afc66ee5bc5a9ed252f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-powerdot-fuberlin-doc"

RDEPENDS:${PN} += ""

inherit rpm
