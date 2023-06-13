SUMMARY = "Documentation for texlive-pst-am"
DESCRIPTION = "This package includes the documentation for texlive-pst-am"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn19591"

RPM_NAME = "texlive-pst-am-doc-2023.201.1.02svn19591-52.1.noarch.rpm"
RPM_HASH = "0fda69b385e7de91afc987504213dae2a8e23b1d599ef235bfa236e526e434909e7835ab95928211456e29dfa862228885bf9e76585f78b571a6909970e6e9fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-am-doc"

RDEPENDS:${PN} += ""

inherit rpm
