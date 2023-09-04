SUMMARY = "Documentation for texlive-pst-tree"
DESCRIPTION = "This package includes the documentation for texlive-pst-tree"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.14svn60421"

RPM_NAME = "texlive-pst-tree-doc-2023.209.1.14svn60421-54.2.noarch.rpm"
RPM_HASH = "34de5438275eb471b85846df9201c804303f7dd95233876a67306fb2bd9f660e4f0e425aafc95f94e77024a2e44d492adce45f49838695f644cfcf147d67d7b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-tree-doc-en \
texlive-pst-tree-doc"

RDEPENDS:${PN} += ""

inherit rpm
