SUMMARY = "Documentation for texlive-expdlist"
DESCRIPTION = "This package includes the documentation for texlive-expdlist"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.4svn15878"

RPM_NAME = "texlive-expdlist-doc-2023.201.2.4svn15878-52.1.noarch.rpm"
RPM_HASH = "69d0fe507fccf34fa54b201d4dbdd34239b229db52168473755bd27d1051d3f75478bf1ed92824d9b0343fb1f4d5795fa6630281b38a05bb3240320845db512f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-expdlist-doc:de;en) \
texlive-expdlist-doc"
RDEPENDS:${PN} += ""

inherit rpm
