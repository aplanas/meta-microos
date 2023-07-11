SUMMARY = "Documentation for texlive-luacomplex"
DESCRIPTION = "This package includes the documentation for texlive-luacomplex"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2svn65833"

RPM_NAME = "texlive-luacomplex-doc-2023.208.1.2svn65833-53.1.noarch.rpm"
RPM_HASH = "d8902a0d7262a46148de125c00cff62fe232f98b33803b9a8adfac8525dd788a8b55dbf90c334a44fcbfa65cc12eb0513c0ddc9fc434cd6e670761f547df1859"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luacomplex-doc"

RDEPENDS:${PN} += ""

inherit rpm
