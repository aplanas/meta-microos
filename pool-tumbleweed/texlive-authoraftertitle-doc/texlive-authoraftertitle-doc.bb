SUMMARY = "Documentation for texlive-authoraftertitle"
DESCRIPTION = "This package includes the documentation for texlive-authoraftertitle"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn55889"

RPM_NAME = "texlive-authoraftertitle-doc-2023.209.1.0svn55889-54.1.noarch.rpm"
RPM_HASH = "adbf0b8d648a33a920b562d4ff08e2f25666020170a58aa1be3e690cea5cc17b08f04f982d5f73db71930001f6b002327092f44e9b8caf9bf44fb77b4c1248f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-authoraftertitle-doc"

RDEPENDS:${PN} += ""

inherit rpm
