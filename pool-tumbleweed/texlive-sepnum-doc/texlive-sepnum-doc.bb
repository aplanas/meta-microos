SUMMARY = "Documentation for texlive-sepnum"
DESCRIPTION = "This package includes the documentation for texlive-sepnum"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn20186"

RPM_NAME = "texlive-sepnum-doc-2023.201.2.0svn20186-53.1.noarch.rpm"
RPM_HASH = "0957677c33ada26197b9d7e940d80faaed854e2335979e3e57002d7fe8a197e5e8b820f8ef03cc8b29120af5f198034ec457befb0c1b7658a9ac38381185115f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sepnum-doc"
RDEPENDS:${PN} += ""

inherit rpm
