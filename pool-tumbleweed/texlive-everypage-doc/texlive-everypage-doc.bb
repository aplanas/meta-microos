SUMMARY = "Documentation for texlive-everypage"
DESCRIPTION = "This package includes the documentation for texlive-everypage"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0bsvn56694"

RPM_NAME = "texlive-everypage-doc-2023.201.2.0bsvn56694-52.1.noarch.rpm"
RPM_HASH = "9d3fc976375deab5ee20273ec7a1c7b67385ae56f5323939777502c099c20505907ad9f581e8ceb4b798c1dc19d027647b7dc47f97c1bfe3335270467e2f671c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-everypage-doc"

RDEPENDS:${PN} += ""

inherit rpm
