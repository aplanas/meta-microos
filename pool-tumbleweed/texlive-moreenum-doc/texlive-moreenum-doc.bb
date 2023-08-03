SUMMARY = "Documentation for texlive-moreenum"
DESCRIPTION = "This package includes the documentation for texlive-moreenum"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.03svn24479"

RPM_NAME = "texlive-moreenum-doc-2023.209.1.03svn24479-55.1.noarch.rpm"
RPM_HASH = "66639b974e79c02d986fc6b176a69f6af9bd8212954458a419534dd863a89a1bf79071eced195c0dd6f439e67a1edb4aba97552a1250bf6504f38af8b6b7800d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-moreenum-doc"

RDEPENDS:${PN} += ""

inherit rpm
