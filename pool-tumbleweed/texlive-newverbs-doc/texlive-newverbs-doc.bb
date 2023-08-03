SUMMARY = "Documentation for texlive-newverbs"
DESCRIPTION = "This package includes the documentation for texlive-newverbs"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6asvn64833"

RPM_NAME = "texlive-newverbs-doc-2023.209.1.6asvn64833-55.1.noarch.rpm"
RPM_HASH = "7d8986419cf518601b8e77411dd0eb4c03f55f68ec6d328ebde194dd157b5a3c87eaad3127889a62d0c5c21301e04c27fd5d97451e25a7c4e677baf41c98f2d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newverbs-doc"

RDEPENDS:${PN} += ""

inherit rpm
