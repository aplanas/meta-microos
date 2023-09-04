SUMMARY = "Documentation for texlive-graphpaper"
DESCRIPTION = "This package includes the documentation for texlive-graphpaper"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn63116"

RPM_NAME = "texlive-graphpaper-doc-2023.209.1.1svn63116-54.2.noarch.rpm"
RPM_HASH = "a7e7a37d13a399d0e8da1f8775cc7056eeca83204456ffc6c7fd8390dcce80cb64703b960077461fc71497824c861510c432e84d7f6cff93cbaecbac7570ad1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphpaper-doc"

RDEPENDS:${PN} += ""

inherit rpm
