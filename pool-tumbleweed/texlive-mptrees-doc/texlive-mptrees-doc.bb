SUMMARY = "Documentation for texlive-mptrees"
DESCRIPTION = "This package includes the documentation for texlive-mptrees"
LICENSE = "LPPL-1.0"

PV = "2023.209.21.11svn60929"

RPM_NAME = "texlive-mptrees-doc-2023.209.21.11svn60929-55.1.noarch.rpm"
RPM_HASH = "8e2fb5c331af8b850d43ba07b53596e811473448d7aced42e20a44805c3715c6b42605ba13a496ed789e32b839ce5c7981fe80a33f5a82ebffee89cbd7d939ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mptrees-doc"

RDEPENDS:${PN} += ""

inherit rpm
