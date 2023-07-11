SUMMARY = "Documentation for texlive-xellipsis"
DESCRIPTION = "This package includes the documentation for texlive-xellipsis"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn47546"

RPM_NAME = "texlive-xellipsis-doc-2023.201.2.0svn47546-52.2.noarch.rpm"
RPM_HASH = "f414f1991d993f369d42b725b3315d00d757a104e06de3f8ba8104ffee2a2248e0c335af0f1e5a5e75e7d5ba0712b9a3a63e05e55e563bbf453d46928cf9049c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xellipsis-doc"

RDEPENDS:${PN} += ""

inherit rpm
