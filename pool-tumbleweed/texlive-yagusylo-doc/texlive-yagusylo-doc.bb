SUMMARY = "Documentation for texlive-yagusylo"
DESCRIPTION = "This package includes the documentation for texlive-yagusylo"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn29803"

RPM_NAME = "texlive-yagusylo-doc-2023.201.1.2svn29803-52.1.noarch.rpm"
RPM_HASH = "c9a6037eaa9639d33edfdfd54548021e3ece0fb7ae0aec7f677db580cd1fc4ea7e20fd584eb374995a0b7bc79ecaebd938319a743b5afeab12031e5a8c884947"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-yagusylo-doc-fr;en \
texlive-yagusylo-doc"

RDEPENDS:${PN} += ""

inherit rpm
