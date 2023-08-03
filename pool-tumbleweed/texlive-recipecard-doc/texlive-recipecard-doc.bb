SUMMARY = "Documentation for texlive-recipecard"
DESCRIPTION = "This package includes the documentation for texlive-recipecard"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn15878"

RPM_NAME = "texlive-recipecard-doc-2023.209.2.0svn15878-54.1.noarch.rpm"
RPM_HASH = "572c2dd28051c7569b5065c927df9b933d767c7dccc7688dae4871823a20bb39265963aee8366170f18fa4655c84694d301cb16f3dc15a1d880c3fe517bdacbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-recipecard-doc"

RDEPENDS:${PN} += ""

inherit rpm
