SUMMARY = "Documentation for texlive-pst-circ"
DESCRIPTION = "This package includes the documentation for texlive-pst-circ"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.19svn60464"

RPM_NAME = "texlive-pst-circ-doc-2023.209.2.19svn60464-53.1.noarch.rpm"
RPM_HASH = "25400b77ddc55c7d347f43bf667e1803bc4abd0d3599e60596ebef8c3c68d116a12a87723d6759fad3481ded207cc71064c4a7d46a2bae2ddc905cbd87ee8033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-circ-doc"

RDEPENDS:${PN} += ""

inherit rpm
