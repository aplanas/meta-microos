SUMMARY = "Documentation for texlive-table-fct"
DESCRIPTION = "This package includes the documentation for texlive-table-fct"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn41849"

RPM_NAME = "texlive-table-fct-doc-2023.209.1.1svn41849-58.1.noarch.rpm"
RPM_HASH = "581cf95b379201a82d53a5c132c65c35c669737a8f1ed2bc0b42a794cfaec6e63067c9d410fb49242e5cfda86268237684e81ea3ea10ee446fa7952e0436f4ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-table-fct-doc"

RDEPENDS:${PN} += ""

inherit rpm
