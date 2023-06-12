SUMMARY = "Documentation for texlive-rectopma"
DESCRIPTION = "This package includes the documentation for texlive-rectopma"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn19980"

RPM_NAME = "texlive-rectopma-doc-2023.201.svn19980-53.1.noarch.rpm"
RPM_HASH = "997895fe4b0846c6778401429b94a4f3d911ef1a03eed10971b4fed43db7e4ca20f3ced3123677be8c787de5fc22c52d176fe65fd2ffaa92d7d2156d761c8ce2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rectopma-doc"
RDEPENDS:${PN} += ""

inherit rpm
