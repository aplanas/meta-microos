SUMMARY = "Documentation for texlive-pst-tree"
DESCRIPTION = "This package includes the documentation for texlive-pst-tree"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.14svn60421"

RPM_NAME = "texlive-pst-tree-doc-2023.209.1.14svn60421-54.1.noarch.rpm"
RPM_HASH = "9df5b85f06eb967dd71498c3eb1f3a5648be35d4336245ae4e0375099fbfb52fcf1acae49812f42c48a7c57dcc127f4a6264cb7152738ac4e61cad96cdce7989"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-tree-doc-en \
texlive-pst-tree-doc"

RDEPENDS:${PN} += ""

inherit rpm
