SUMMARY = "Documentation for texlive-yb-book"
DESCRIPTION = "This package includes the documentation for texlive-yb-book"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.0svn64586"

RPM_NAME = "texlive-yb-book-doc-2023.201.0.0.2.0svn64586-52.1.noarch.rpm"
RPM_HASH = "1e98b05c7e6dc79f2d522728149dbf9e53493cc50801fb1c1b3f74a1593da8188197e399e2a0cc5fe65ca033b6102535aef0b8c1727d74c724d936dcdf9cecf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yb-book-doc"
RDEPENDS:${PN} += ""

inherit rpm
