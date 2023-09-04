SUMMARY = "Documentation for texlive-erdc"
DESCRIPTION = "This package includes the documentation for texlive-erdc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-erdc-doc-2023.209.1.1svn15878-54.2.noarch.rpm"
RPM_HASH = "10fc0857c44a6d27b72838c7c4ac587ad3612f460cfccef3e0bcb17ea175be44f34d30c25ab7d12fb5eb28922d69d651e76d463cc84186431382182e60135d41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-erdc-doc"

RDEPENDS:${PN} += ""

inherit rpm
