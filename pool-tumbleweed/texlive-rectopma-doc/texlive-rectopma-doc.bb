SUMMARY = "Documentation for texlive-rectopma"
DESCRIPTION = "This package includes the documentation for texlive-rectopma"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn19980"

RPM_NAME = "texlive-rectopma-doc-2023.209.svn19980-54.2.noarch.rpm"
RPM_HASH = "3bd7158946d9dcd0210a034966f3f27f8aaeb0c43b76afae30913118bb79655f28d381eeb910e42a79caeebc0e9f92776320d39a060da1abb87d9f3c0478233e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rectopma-doc"

RDEPENDS:${PN} += ""

inherit rpm
