SUMMARY = "Documentation for texlive-moresize"
DESCRIPTION = "This package includes the documentation for texlive-moresize"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9svn17513"

RPM_NAME = "texlive-moresize-doc-2023.201.1.9svn17513-54.1.noarch.rpm"
RPM_HASH = "8810047291a45b409a43f9065dbe088148df392683c8ef3b81da8908a74f7ad34c23f3632dc87e1356fb5d442d5b9ac9fc9f0a5952c32628d65851ef9cc72df4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-moresize-doc"
RDEPENDS:${PN} += ""

inherit rpm
