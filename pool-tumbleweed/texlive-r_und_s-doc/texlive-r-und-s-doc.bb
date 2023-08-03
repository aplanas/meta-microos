SUMMARY = "Documentation for texlive-r_und_s"
DESCRIPTION = "This package includes the documentation for texlive-r_und_s"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3isvn15878"

RPM_NAME = "texlive-r_und_s-doc-2023.209.1.3isvn15878-54.1.noarch.rpm"
RPM_HASH = "4b5bb27894c7c29710479a617faeacab0a304b7cf8b5c99aa08c75a70624aa4451481e91fa7496f8ce4927a040b3b218783ad3df814674ecc69e6b84e4588b2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-r-und-s-doc"

RDEPENDS:${PN} += ""

inherit rpm
