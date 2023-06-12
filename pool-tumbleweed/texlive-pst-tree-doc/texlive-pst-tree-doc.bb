SUMMARY = "Documentation for texlive-pst-tree"
DESCRIPTION = "This package includes the documentation for texlive-pst-tree"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.14svn60421"

RPM_NAME = "texlive-pst-tree-doc-2023.201.1.14svn60421-53.1.noarch.rpm"
RPM_HASH = "5b626c7469a30c3fdcb59ab4aaa214157947afd80064ffd8bde38afc98d8f160dbc6a993f28a08df27769bc90f18637897424bb3d319d34ca9875be5db7ba1a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pst-tree-doc:en) \
texlive-pst-tree-doc"
RDEPENDS:${PN} += ""

inherit rpm
