SUMMARY = "Documentation for texlive-asmeconf"
DESCRIPTION = "This package includes the documentation for texlive-asmeconf"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.34svn65413"

RPM_NAME = "texlive-asmeconf-doc-2023.201.1.34svn65413-53.1.noarch.rpm"
RPM_HASH = "87d9d03d67361b5132e4d1e2dc134793ddb17a355d7f640b754db75908d6335d9900168102d7ab284cbe8541403e3e6c3a6c4287a8f9af68bbc25cc0576940a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asmeconf-doc"
RDEPENDS:${PN} += ""

inherit rpm
