SUMMARY = "Documentation for texlive-movie15"
DESCRIPTION = "This package includes the documentation for texlive-movie15"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn26473"

RPM_NAME = "texlive-movie15-doc-2023.201.svn26473-54.1.noarch.rpm"
RPM_HASH = "cf2037439452d51ef7ed71007d73637b2179638a0ae868c55e78eeb575b9169dee7b62be97ab45ee1cd5edce23eedc491f297f2a8506ad5fe8524ee130b5ee54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-movie15-doc"
RDEPENDS:${PN} += ""

inherit rpm
