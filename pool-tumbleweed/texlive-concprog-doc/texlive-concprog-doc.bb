SUMMARY = "Documentation for texlive-concprog"
DESCRIPTION = "This package includes the documentation for texlive-concprog"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn18791"

RPM_NAME = "texlive-concprog-doc-2023.201.svn18791-53.1.noarch.rpm"
RPM_HASH = "9c91af7ea8fc5521d4a96445a15d2f07fe6f72452970672f73c60e377c55e87d0cf498ec148e190edf8ec0709c15ac8914b883f318606f1fc46e2cdccb624974"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-concprog-doc"
RDEPENDS:${PN} += ""

inherit rpm
