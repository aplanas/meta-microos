SUMMARY = "Documentation for texlive-epigraph"
DESCRIPTION = "This package includes the documentation for texlive-epigraph"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5esvn54857"

RPM_NAME = "texlive-epigraph-doc-2023.201.1.5esvn54857-53.2.noarch.rpm"
RPM_HASH = "b1a22d9ab4c627a1650d3d1ed1a1282f589ac975106aaefcdbe81bae8915ca373864b50ca45affe201f4bf5ab8d75188390ce934c62e2113dbc36ead4743a084"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epigraph-doc"

RDEPENDS:${PN} += ""

inherit rpm
