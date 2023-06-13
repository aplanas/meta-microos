SUMMARY = "Documentation for texlive-bankstatement"
DESCRIPTION = "This package includes the documentation for texlive-bankstatement"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9.2svn38857"

RPM_NAME = "texlive-bankstatement-doc-2023.201.0.0.9.2svn38857-53.1.noarch.rpm"
RPM_HASH = "e01a5d73f2eea2fa55cb876ec1b43329c5c3e5bf6e7bbb806a6fc7802a7bddce09de35c203e7f65ba5ec6b5be3ee506c158fcce909d500e1dbd808c5335172e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bankstatement-doc"

RDEPENDS:${PN} += ""

inherit rpm
