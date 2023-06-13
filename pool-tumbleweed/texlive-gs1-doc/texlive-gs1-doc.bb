SUMMARY = "Documentation for texlive-gs1"
DESCRIPTION = "This package includes the documentation for texlive-gs1"
LICENSE = "LPPL-1.0"

PV = "2023.201.23svn59620"

RPM_NAME = "texlive-gs1-doc-2023.201.23svn59620-53.1.noarch.rpm"
RPM_HASH = "8b79661bc0c20d27e9fad6d854112fc466e05da46127ca1b61a49dba86b2a8d6bb88806740d70e43dfe50e2e3ceb07e331a710c77814be77ee971f04e699e599"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gs1-doc"

RDEPENDS:${PN} += ""

inherit rpm
