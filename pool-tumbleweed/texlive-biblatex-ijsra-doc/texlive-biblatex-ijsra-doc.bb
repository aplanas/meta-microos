SUMMARY = "Documentation for texlive-biblatex-ijsra"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-ijsra"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn41634"

RPM_NAME = "texlive-biblatex-ijsra-doc-2023.209.0.0.1svn41634-54.1.noarch.rpm"
RPM_HASH = "461e8b0987743b7900f3e5df84c18ba2be2a9e595b915e0f50f5dba3ea07e441a06ed4599db82e4a3ed8b22b212ee7ed4323a21c50fde38fab8888cd3e45cfaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-ijsra-doc"

RDEPENDS:${PN} += ""

inherit rpm
