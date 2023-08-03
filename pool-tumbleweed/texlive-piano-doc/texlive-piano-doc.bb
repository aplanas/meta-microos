SUMMARY = "Documentation for texlive-piano"
DESCRIPTION = "This package includes the documentation for texlive-piano"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn21574"

RPM_NAME = "texlive-piano-doc-2023.209.1.0svn21574-52.1.noarch.rpm"
RPM_HASH = "f01a75aa1efed21aff90cad98f3dc900f953d5ef1299dc053c064a1320c2d2e7f44e0b434767d9e86ea09cb21b04b6dba0e4fb02b07917a9a7db1c9e5ad3a572"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-piano-doc"

RDEPENDS:${PN} += ""

inherit rpm
