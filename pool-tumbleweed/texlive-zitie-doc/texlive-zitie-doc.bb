SUMMARY = "Documentation for texlive-zitie"
DESCRIPTION = "This package includes the documentation for texlive-zitie"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4.0svn60676"

RPM_NAME = "texlive-zitie-doc-2023.201.1.4.0svn60676-52.1.noarch.rpm"
RPM_HASH = "46604a3d60173839bc8a9a2fe2ed3c985b7984789acc43694526b39cce8761991380b53a030bace14a118283f214520cbb5c9e0f54d5c54057d18ddbaa09d499"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-zitie-doc-zh \
texlive-zitie-doc"

RDEPENDS:${PN} += ""

inherit rpm
