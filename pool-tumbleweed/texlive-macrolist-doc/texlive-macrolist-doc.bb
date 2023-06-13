SUMMARY = "Documentation for texlive-macrolist"
DESCRIPTION = "This package includes the documentation for texlive-macrolist"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.0svn60139"

RPM_NAME = "texlive-macrolist-doc-2023.201.2.1.0svn60139-52.1.noarch.rpm"
RPM_HASH = "797da839d261c9a9925f1fdcecf2bb83fbe48eac4c4e799e515cf3b5458980c3fd16f38fea633371e8b44f85dfab52b962817bb756ce21bd3a6e739126d6d28e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-macrolist-doc"

RDEPENDS:${PN} += ""

inherit rpm
