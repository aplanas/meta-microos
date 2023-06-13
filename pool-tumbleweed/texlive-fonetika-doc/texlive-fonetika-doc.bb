SUMMARY = "Documentation for texlive-fonetika"
DESCRIPTION = "This package includes the documentation for texlive-fonetika"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21326"

RPM_NAME = "texlive-fonetika-doc-2023.201.svn21326-52.1.noarch.rpm"
RPM_HASH = "5d4b0361b62f7223bc4a3b4d8a84b32675833905e4c994cbab9271514a68fa4002793b1c5a03a73183704be0e0690e1297788b51f3003992d97d621c1c76f7d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fonetika-doc"

RDEPENDS:${PN} += ""

inherit rpm
