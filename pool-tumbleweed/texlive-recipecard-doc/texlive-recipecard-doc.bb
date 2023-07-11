SUMMARY = "Documentation for texlive-recipecard"
DESCRIPTION = "This package includes the documentation for texlive-recipecard"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn15878"

RPM_NAME = "texlive-recipecard-doc-2023.201.2.0svn15878-53.2.noarch.rpm"
RPM_HASH = "5840e11e2da4b935446c7b9a0f8ebc8294ad1087b6189cf10a04babd6fe879373ac7eb58bdf2a8af2f81681d9c84b63ff7980811a9c74b5f603e011cc40826e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-recipecard-doc"

RDEPENDS:${PN} += ""

inherit rpm
