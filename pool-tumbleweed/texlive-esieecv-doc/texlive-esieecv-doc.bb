SUMMARY = "Documentation for texlive-esieecv"
DESCRIPTION = "This package includes the documentation for texlive-esieecv"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn59638"

RPM_NAME = "texlive-esieecv-doc-2023.201.svn59638-53.1.noarch.rpm"
RPM_HASH = "c955ba7c6c0f1a615ad4d628de5f693a589d8964b7a60811c51ac28d09a37731723ff6f2a76fab89497038f811acac6992df2f35eea23a76bcdd1780a0f69d27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esieecv-doc"

RDEPENDS:${PN} += ""

inherit rpm
