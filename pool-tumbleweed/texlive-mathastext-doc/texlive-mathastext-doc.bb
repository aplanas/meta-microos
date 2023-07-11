SUMMARY = "Documentation for texlive-mathastext"
DESCRIPTION = "This package includes the documentation for texlive-mathastext"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.3ysvn64930"

RPM_NAME = "texlive-mathastext-doc-2023.208.1.3ysvn64930-53.1.noarch.rpm"
RPM_HASH = "c7901df077009893289368646301eb52b7514d8ff4ac36c70ba697ee9a3f4f2ef670ed29dc04991ed0890e64438dee61a8a0c99b5ee3d0cc31c7e0c0c9fef728"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathastext-doc"

RDEPENDS:${PN} += ""

inherit rpm
