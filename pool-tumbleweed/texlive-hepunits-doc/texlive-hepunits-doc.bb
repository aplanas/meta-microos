SUMMARY = "Documentation for texlive-hepunits"
DESCRIPTION = "This package includes the documentation for texlive-hepunits"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.0svn54758"

RPM_NAME = "texlive-hepunits-doc-2023.201.2.0.0svn54758-53.1.noarch.rpm"
RPM_HASH = "b83148597a4c08b4788f0f6f5cc995ddeb9343d1a8084e45e2a959ac202e150fe0a889bb1c5ad6edd0c9bd1ae76723b9724903a06073743fd4e0b18187c5f1bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hepunits-doc"
RDEPENDS:${PN} += ""

inherit rpm
