SUMMARY = "Documentation for texlive-memorygraphs"
DESCRIPTION = "This package includes the documentation for texlive-memorygraphs"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.1svn49631"

RPM_NAME = "texlive-memorygraphs-doc-2023.201.0.0.1.1svn49631-52.1.noarch.rpm"
RPM_HASH = "6f2a1934801440ae4753c6de865edcf28ee429bfe3b6a2261287881223829b3aa5506d992158e676ad3ae3633d85f10b8a7b6bc0edbd6cdae291c27e2eb7e4cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-memorygraphs-doc"

RDEPENDS:${PN} += ""

inherit rpm
