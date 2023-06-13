SUMMARY = "Documentation for texlive-latexdemo"
DESCRIPTION = "This package includes the documentation for texlive-latexdemo"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn55265"

RPM_NAME = "texlive-latexdemo-doc-2023.201.0.0.1svn55265-54.1.noarch.rpm"
RPM_HASH = "481873098d0d69f5b60d425cbfa278864ff3fbdd00f6b7258277943392df5f1a41e9141e2f0d60dd8726d69542c468bc258a1d34a0be857487f268816b2030f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexdemo-doc"

RDEPENDS:${PN} += ""

inherit rpm
