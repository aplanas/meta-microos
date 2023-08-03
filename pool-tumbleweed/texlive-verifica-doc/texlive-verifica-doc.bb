SUMMARY = "Documentation for texlive-verifica"
DESCRIPTION = "This package includes the documentation for texlive-verifica"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn56625"

RPM_NAME = "texlive-verifica-doc-2023.209.1.3svn56625-54.1.noarch.rpm"
RPM_HASH = "e082a5fb48e5ad06cac54dd03cb1d4f92820a79d0d318dce6b72ca8b50bec2d141c61bc10fce7869fdfb49e36fa3b851023842d17fa36d250e460d9ca24b3961"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-verifica-doc-it \
texlive-verifica-doc"

RDEPENDS:${PN} += ""

inherit rpm
