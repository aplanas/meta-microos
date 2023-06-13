SUMMARY = "Documentation for texlive-eqlist"
DESCRIPTION = "This package includes the documentation for texlive-eqlist"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn32257"

RPM_NAME = "texlive-eqlist-doc-2023.201.2.1svn32257-53.1.noarch.rpm"
RPM_HASH = "75f148749e92f4f977491384a04ac096805ddfb8d34848f058d0bd765df7135de29de366c126611fc8570b0bddee4b43fd112bad3ffe3dec6c6c428fa616f355"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqlist-doc"

RDEPENDS:${PN} += ""

inherit rpm
