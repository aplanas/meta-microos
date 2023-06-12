SUMMARY = "Documentation for texlive-was"
DESCRIPTION = "This package includes the documentation for texlive-was"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64691"

RPM_NAME = "texlive-was-doc-2023.201.svn64691-53.1.noarch.rpm"
RPM_HASH = "e4e49491c1edacdfb24252333414aa875977e92997e9ea1293c4ebd9a144d6172c6e0c0aad604713c90ccce362b6c16ddd5f0b40a51490e5b926e2fb50f94c28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-was-doc"
RDEPENDS:${PN} += ""

inherit rpm
