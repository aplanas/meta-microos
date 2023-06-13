SUMMARY = "Documentation for texlive-resumecls"
DESCRIPTION = "This package includes the documentation for texlive-resumecls"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.1svn54815"

RPM_NAME = "texlive-resumecls-doc-2023.201.0.0.4.1svn54815-53.1.noarch.rpm"
RPM_HASH = "33fed13263b3e4f1b354285c8e09f920c853de8b67b94f84bfcff52e206b0e7dfe72f96873770e20153d80314c01c7e9595a7f20676b70b5b01d181423d1345f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-resumecls-doc"

RDEPENDS:${PN} += ""

inherit rpm
