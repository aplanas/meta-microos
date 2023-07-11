SUMMARY = "Documentation for texlive-purifyeps"
DESCRIPTION = "This package includes the documentation for texlive-purifyeps"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn29725"

RPM_NAME = "texlive-purifyeps-doc-2023.201.1.1svn29725-53.2.noarch.rpm"
RPM_HASH = "0f0a6f9a8e4f44198c140504dc2620510afece010f549d7c4950fb5db1fb87b83a91025584217a2d1bda27bed049e5d1e6be4d6079ae63b2a6df8618ce042c4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-purifyeps.1 \
texlive-purifyeps-doc"

RDEPENDS:${PN} += ""

inherit rpm
