SUMMARY = "Documentation for texlive-rank-2-roots"
DESCRIPTION = "This package includes the documentation for texlive-rank-2-roots"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn61719"

RPM_NAME = "texlive-rank-2-roots-doc-2023.201.1.0svn61719-53.1.noarch.rpm"
RPM_HASH = "7ce985a9a0b0c9b58d6c3a1947aa522a549ba0457c91d457792dee14ca01bc4566f79d79a92409bf75e88308267174eb27fb2cadd901f8cc1e4628f455254dff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rank-2-roots-doc"
RDEPENDS:${PN} += ""

inherit rpm
