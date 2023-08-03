SUMMARY = "Documentation for texlive-bboldx"
DESCRIPTION = "This package includes the documentation for texlive-bboldx"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.032svn65424"

RPM_NAME = "texlive-bboldx-doc-2023.209.1.032svn65424-54.1.noarch.rpm"
RPM_HASH = "2ce553f011a285b096a29881be15c0d17e47998653470be583db9a28b78219e25e348c47d14fcc9acb22251d6a0e00d9595beacba5f351dc01f62b80d2e79ac3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bboldx-doc"

RDEPENDS:${PN} += ""

inherit rpm
