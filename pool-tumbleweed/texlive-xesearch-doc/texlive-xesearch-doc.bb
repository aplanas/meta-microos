SUMMARY = "Documentation for texlive-xesearch"
DESCRIPTION = "This package includes the documentation for texlive-xesearch"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn51908"

RPM_NAME = "texlive-xesearch-doc-2023.201.0.0.2svn51908-52.2.noarch.rpm"
RPM_HASH = "30d3e281b439f77bc8e978c476691241fb9808432e680b7803bd2a72f50b9761a885adb195410c152dd426b5dc8f774ae668dd646abfc5e8831062709dd378d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xesearch-doc"

RDEPENDS:${PN} += ""

inherit rpm
