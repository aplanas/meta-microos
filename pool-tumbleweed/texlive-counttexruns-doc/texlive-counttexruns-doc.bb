SUMMARY = "Documentation for texlive-counttexruns"
DESCRIPTION = "This package includes the documentation for texlive-counttexruns"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.00asvn27576"

RPM_NAME = "texlive-counttexruns-doc-2023.204.1.00asvn27576-54.1.noarch.rpm"
RPM_HASH = "fc4788c89ff7bfa6ee2c3e0b4e19e2d84b9a149ef9daee01667c5826453bf9ce3fe961a744ddb03d2788e9b4c88dbbea66e05154b8d4344c38bda4ece3d29fb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-counttexruns-doc"

RDEPENDS:${PN} += ""

inherit rpm
