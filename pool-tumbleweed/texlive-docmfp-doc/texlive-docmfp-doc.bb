SUMMARY = "Documentation for texlive-docmfp"
DESCRIPTION = "This package includes the documentation for texlive-docmfp"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2dsvn15878"

RPM_NAME = "texlive-docmfp-doc-2023.201.1.2dsvn15878-52.1.noarch.rpm"
RPM_HASH = "a7a10a67dc229aabbf1ea6abd477928b581898b57b155999ea2fb4d804f1b78f40320715a896d7651c1ca852fb23fdea66101c8e22143cb96cd01a2445fe13df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-docmfp-doc"

RDEPENDS:${PN} += ""

inherit rpm
