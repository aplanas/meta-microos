SUMMARY = "Documentation for texlive-nanumtype1"
DESCRIPTION = "This package includes the documentation for texlive-nanumtype1"
LICENSE = "OFL-1.1"

PV = "2023.209.3.0svn29558"

RPM_NAME = "texlive-nanumtype1-doc-2023.209.3.0svn29558-55.1.noarch.rpm"
RPM_HASH = "756e1d4e3d60c67eebff5c3123fd8b8094704dfd0d4d3025ca58208aa42bc4de4375135aa269cfb92e8670262283564665c1769de3cc6d46d0282b74d0aa180a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nanumtype1-doc"

RDEPENDS:${PN} += ""

inherit rpm
