SUMMARY = "Documentation for texlive-listofsymbols"
DESCRIPTION = "This package includes the documentation for texlive-listofsymbols"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn16134"

RPM_NAME = "texlive-listofsymbols-doc-2023.201.0.0.2svn16134-54.1.noarch.rpm"
RPM_HASH = "ed292c7b611fe48c33baf583495be19d6afe8112869ceb02ab0e91dc2490ab462e26c52529ebb06992acaf22c072474addfd0e44ec9d3827c364fd464cde8edc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-listofsymbols-doc"
RDEPENDS:${PN} += ""

inherit rpm
