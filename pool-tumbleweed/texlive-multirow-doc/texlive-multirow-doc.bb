SUMMARY = "Documentation for texlive-multirow"
DESCRIPTION = "This package includes the documentation for texlive-multirow"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.8svn58396"

RPM_NAME = "texlive-multirow-doc-2023.209.2.8svn58396-55.1.noarch.rpm"
RPM_HASH = "b6d4a59b1fe4ac3a5c6d1157303201e5af3a8a16b74fbd5405781802074737cd7a1e00e8498c54ca0125ea683109fbe7a36b27d8acd85210505c6d540384f78e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multirow-doc"

RDEPENDS:${PN} += ""

inherit rpm
