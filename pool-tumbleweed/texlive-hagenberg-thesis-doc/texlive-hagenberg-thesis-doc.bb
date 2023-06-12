SUMMARY = "Documentation for texlive-hagenberg-thesis"
DESCRIPTION = "This package includes the documentation for texlive-hagenberg-thesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65819"

RPM_NAME = "texlive-hagenberg-thesis-doc-2023.201.svn65819-53.1.noarch.rpm"
RPM_HASH = "637a588d237f27ed2e36a9d7603e6e7dcc21aa258a45dd3d009c6dfba430b9901dbb0064dbda036e18f5d7d29f57d8d86d0a235d59a33a39f4411af05e8ed99d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-hagenberg-thesis-doc:de;en) \
texlive-hagenberg-thesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
