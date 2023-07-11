SUMMARY = "Documentation for texlive-inputtrc"
DESCRIPTION = "This package includes the documentation for texlive-inputtrc"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.3svn28019"

RPM_NAME = "texlive-inputtrc-doc-2023.208.0.0.3svn28019-53.1.noarch.rpm"
RPM_HASH = "046609ebfabe71835596b100edde76ec092e12931f9419017298ada3fe989ca4dfb843568238f7b10deb9fa4fc48d0ff269c6a6300fbb458ad6feae4661f8257"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inputtrc-doc"

RDEPENDS:${PN} += ""

inherit rpm
