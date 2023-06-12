SUMMARY = "Documentation for texlive-block"
DESCRIPTION = "This package includes the documentation for texlive-block"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn17209"

RPM_NAME = "texlive-block-doc-2023.201.svn17209-52.1.noarch.rpm"
RPM_HASH = "85759c54f8b3a9c1b4bff876bb4131373306ebe97251a6828f654178964712aea79b7d51486a77ea954c0f33807791be53e067024c1435d33b550de67bd0f387"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-block-doc"
RDEPENDS:${PN} += ""

inherit rpm
