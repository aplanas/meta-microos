SUMMARY = "Documentation for texlive-luafindfont"
DESCRIPTION = "This package includes the documentation for texlive-luafindfont"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.11svn64936"

RPM_NAME = "texlive-luafindfont-doc-2023.208.0.0.11svn64936-53.1.noarch.rpm"
RPM_HASH = "7f0c0885761ecf0ecf8af5cf296f0e479f19a585b6597ea6f137a0ed89e86ce531b02bbab93cca11df3709aeb16cb62075bfbcb9bb432de9144df0d1b474fd00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-luafindfont.1 \
texlive-luafindfont-doc"

RDEPENDS:${PN} += ""

inherit rpm
