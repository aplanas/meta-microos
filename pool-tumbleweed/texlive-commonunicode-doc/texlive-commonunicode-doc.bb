SUMMARY = "Documentation for texlive-commonunicode"
DESCRIPTION = "This package includes the documentation for texlive-commonunicode"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn62901"

RPM_NAME = "texlive-commonunicode-doc-2023.201.1.0.0svn62901-53.1.noarch.rpm"
RPM_HASH = "70691f9af5408f2a9be7fd271368310012a5c1ca5357078e0282044672fbdb372121061194dad46e47ee07f8b25f30c766d4205e2a6fb04eae723247e4832a04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-commonunicode-doc"

RDEPENDS:${PN} += ""

inherit rpm
