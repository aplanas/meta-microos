SUMMARY = "Documentation for texlive-iftex"
DESCRIPTION = "This package includes the documentation for texlive-iftex"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0fsvn61910"

RPM_NAME = "texlive-iftex-doc-2023.208.1.0fsvn61910-53.1.noarch.rpm"
RPM_HASH = "1960cc9d3320dbb4a9a9535b5a8b11f1c3350fea64c55f1f8049896e2521fa0be5dc1ccc0fdc1cca79fbf1f0ab338036ed3be6da5048f2105447a68ca24f5d3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iftex-doc"

RDEPENDS:${PN} += ""

inherit rpm
