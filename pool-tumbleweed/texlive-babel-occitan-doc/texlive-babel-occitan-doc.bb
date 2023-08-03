SUMMARY = "Documentation for texlive-babel-occitan"
DESCRIPTION = "This package includes the documentation for texlive-babel-occitan"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn39608"

RPM_NAME = "texlive-babel-occitan-doc-2023.209.0.0.2svn39608-54.1.noarch.rpm"
RPM_HASH = "effbc4892db642b91980537b3c4a2f5e01b03fa7ffcb228c8edc8797da663f35ad6263c732ed581ce8859c22bb18d61624d54bbb1df83fbf08d8ba2d463e208c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-occitan-doc"

RDEPENDS:${PN} += ""

inherit rpm
