SUMMARY = "Documentation for texlive-eolang"
DESCRIPTION = "This package includes the documentation for texlive-eolang"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.12.1svn66274"

RPM_NAME = "texlive-eolang-doc-2023.201.0.0.12.1svn66274-53.2.noarch.rpm"
RPM_HASH = "7385d9d591e099959b2f95cb312dfca677b5b2fa0b5879b8edfd40c1cf0f511d5a3c94292ba1f87b9ae74b0ec95d8fc481c1a030ce448c5c80096e3540ab38a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eolang-doc"

RDEPENDS:${PN} += ""

inherit rpm
