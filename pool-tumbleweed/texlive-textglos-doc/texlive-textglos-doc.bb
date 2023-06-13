SUMMARY = "Documentation for texlive-textglos"
DESCRIPTION = "This package includes the documentation for texlive-textglos"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn30788"

RPM_NAME = "texlive-textglos-doc-2023.201.1.0svn30788-54.1.noarch.rpm"
RPM_HASH = "451cf0ccca8cdedd05ba8a63d3edc075a76f6b791eddc645b44809e8c47a21841aa13db56f3536b5db861347e87c58820a29600df2cc6e57cbb9f2e6582a7543"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textglos-doc"

RDEPENDS:${PN} += ""

inherit rpm
