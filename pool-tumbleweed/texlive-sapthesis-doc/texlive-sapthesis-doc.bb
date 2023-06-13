SUMMARY = "Documentation for texlive-sapthesis"
DESCRIPTION = "This package includes the documentation for texlive-sapthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.5.1svn63810"

RPM_NAME = "texlive-sapthesis-doc-2023.201.5.1svn63810-53.1.noarch.rpm"
RPM_HASH = "f43e72e1a9cca7fc40c7bcd0c40a9d0f12095cff506cbb598d8e0a6c67f826fa8dd1ab7a504b9562002336a5157e43ac71b412ba4f5e3fd287c4416093804ec6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sapthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
