SUMMARY = "Documentation for texlive-noconflict"
DESCRIPTION = "This package includes the documentation for texlive-noconflict"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn30140"

RPM_NAME = "texlive-noconflict-doc-2023.209.1.0svn30140-55.1.noarch.rpm"
RPM_HASH = "fbd9e1f55b18e24c16721e50f7d9b2e46b238f7e67842331bcfb292f71a2a3664037c13f54b6b51ff7b6802f62c639d9bb1fe1f7b97469a70864f0b3f132b0b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-noconflict-doc"

RDEPENDS:${PN} += ""

inherit rpm
