SUMMARY = "Documentation for texlive-lua-uca"
DESCRIPTION = "This package includes the documentation for texlive-lua-uca"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1bsvn61023"

RPM_NAME = "texlive-lua-uca-doc-2023.208.0.0.1bsvn61023-53.1.noarch.rpm"
RPM_HASH = "4a327bc44efe31a5253117d0b0e0b2348015e0dd3028f135d3918c3f442457a557c7bb2641754d5d6c760b029c6b3ce890b790bb2aa12ef147e26449ebd1b928"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-uca-doc"

RDEPENDS:${PN} += ""

inherit rpm
