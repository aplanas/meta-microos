SUMMARY = "Documentation for texlive-datetime2-ukrainian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-ukrainian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2asvn47552"

RPM_NAME = "texlive-datetime2-ukrainian-doc-2023.201.1.2asvn47552-52.1.noarch.rpm"
RPM_HASH = "87340fb1b2c2776352025cbb115ae933e732c04c2d891ab4c14d452dfade5d1d9842998f81af4bf55b335113c58894b5f82bfa92d3e2e150fbdc61bc34b6c3f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-ukrainian-doc"
RDEPENDS:${PN} += ""

inherit rpm
