SUMMARY = "Documentation for texlive-chemsec"
DESCRIPTION = "This package includes the documentation for texlive-chemsec"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.12asvn46972"

RPM_NAME = "texlive-chemsec-doc-2023.201.1.12asvn46972-53.1.noarch.rpm"
RPM_HASH = "f7ffddc758697ec8581ca93da1eba3f7b8b205d89f7b6db37d416a8ab907e8e505407f464ec662001292eb4db1549e11f715f69068c89162562742852d82bd90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chemsec-doc"
RDEPENDS:${PN} += ""

inherit rpm
