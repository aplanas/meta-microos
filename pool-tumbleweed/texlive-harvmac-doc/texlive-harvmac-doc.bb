SUMMARY = "Documentation for texlive-harvmac"
DESCRIPTION = "This package includes the documentation for texlive-harvmac"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-harvmac-doc-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "146ebaa6c50647bf50f39a42a91a884e1fa2a4027f55c384d7bcb6bbb27cdda17bcde65aac220c89f434d455cde6f480c40d8feedbfa7e8ca12c51210e1d4d73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harvmac-doc"

RDEPENDS:${PN} += ""

inherit rpm
