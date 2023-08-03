SUMMARY = "Documentation for texlive-multibibliography"
DESCRIPTION = "This package includes the documentation for texlive-multibibliography"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.03svn30939"

RPM_NAME = "texlive-multibibliography-doc-2023.209.1.03svn30939-55.1.noarch.rpm"
RPM_HASH = "d2b0bfb6123fc4c88a25fa411b01c089f02545e6b6119f037c8860008507979867a03e9bdd2e5276efb1fc835b9eef1b8967a43bf00968d028580e241ac52e31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multibibliography-doc"

RDEPENDS:${PN} += ""

inherit rpm
