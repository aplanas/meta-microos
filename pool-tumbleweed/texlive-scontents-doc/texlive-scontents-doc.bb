SUMMARY = "Documentation for texlive-scontents"
DESCRIPTION = "This package includes the documentation for texlive-scontents"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn62902"

RPM_NAME = "texlive-scontents-doc-2023.201.2.0svn62902-53.1.noarch.rpm"
RPM_HASH = "140e257de8ea8965a8717beea625c41109479f990b5c3b0305b11519434298f02c5bce683186fdd0ce69bed851e626fb4c5c0f307b503d567e35a2a6b9602e50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scontents-doc"

RDEPENDS:${PN} += ""

inherit rpm
