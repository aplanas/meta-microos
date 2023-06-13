SUMMARY = "Documentation for texlive-easyfig"
DESCRIPTION = "This package includes the documentation for texlive-easyfig"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2asvn64967"

RPM_NAME = "texlive-easyfig-doc-2023.201.1.2asvn64967-53.1.noarch.rpm"
RPM_HASH = "c495d27837522b4ef3da23767408323287b46603e595ccac732844a9cabb20a15515fc53c18882d04eff9c5b2728f91b21ee9ad321cce4d77811e694ab379070"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easyfig-doc"

RDEPENDS:${PN} += ""

inherit rpm
