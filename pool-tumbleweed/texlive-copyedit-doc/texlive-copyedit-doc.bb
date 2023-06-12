SUMMARY = "Documentation for texlive-copyedit"
DESCRIPTION = "This package includes the documentation for texlive-copyedit"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.6svn37928"

RPM_NAME = "texlive-copyedit-doc-2023.204.1.6svn37928-54.1.noarch.rpm"
RPM_HASH = "8d814b74db9122f9b04b340f90c7b7369983b1daffdb8582290104567e597dc30d3c4a261c1e154aed0fc01dac40a76b33e99a91f1be716f2d126b7728bde036"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-copyedit-doc"
RDEPENDS:${PN} += ""

inherit rpm
