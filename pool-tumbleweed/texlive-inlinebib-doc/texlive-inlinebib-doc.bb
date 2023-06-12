SUMMARY = "Documentation for texlive-inlinebib"
DESCRIPTION = "This package includes the documentation for texlive-inlinebib"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn22018"

RPM_NAME = "texlive-inlinebib-doc-2023.201.svn22018-52.1.noarch.rpm"
RPM_HASH = "fa4c9e5287f213b6a32b66fc49f1cf289f444cd3ad0f4b1557d1a0b010f18a4e1095685f6401ce0f0c6b6f7be2674d940744dd82a2748be87835e16a42beec99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inlinebib-doc"
RDEPENDS:${PN} += ""

inherit rpm
