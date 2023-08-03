SUMMARY = "Documentation for texlive-txgreeks"
DESCRIPTION = "This package includes the documentation for texlive-txgreeks"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn21839"

RPM_NAME = "texlive-txgreeks-doc-2023.209.1.0svn21839-53.1.noarch.rpm"
RPM_HASH = "cb8298bf1653aa31a7f4cc165351c709908ba847192f2447ed67a77cbe39a7dfe5bd18157223cd4de70f866ad06a706aa03a184ec50200b84a8424fa0d8ffd17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-txgreeks-doc"

RDEPENDS:${PN} += ""

inherit rpm
