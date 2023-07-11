SUMMARY = "Documentation for texlive-pst-stru"
DESCRIPTION = "This package includes the documentation for texlive-pst-stru"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.13svn38613"

RPM_NAME = "texlive-pst-stru-doc-2023.201.0.0.13svn38613-53.2.noarch.rpm"
RPM_HASH = "78177f3ca0b3b0169eb7cd28ae6e10d1bddaf0088decbe6f65cd75761001945da8acbe397c452a6da9e92c3c949429b4f43387e2385c6f9717885c549387cd51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-stru-doc"

RDEPENDS:${PN} += ""

inherit rpm
