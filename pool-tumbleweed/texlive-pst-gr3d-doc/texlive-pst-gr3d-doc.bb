SUMMARY = "Documentation for texlive-pst-gr3d"
DESCRIPTION = "This package includes the documentation for texlive-pst-gr3d"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.34svn15878"

RPM_NAME = "texlive-pst-gr3d-doc-2023.201.1.34svn15878-52.1.noarch.rpm"
RPM_HASH = "8ad74ae9d66efb384d72542a6ec3442c63842291ea955b58f71b6dbe2f235280429005b03fd3a8110e16bbbfc5aba3ea97b90530ea3456cb7f0fbd969a1ca207"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-gr3d-doc"

RDEPENDS:${PN} += ""

inherit rpm
