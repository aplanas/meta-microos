SUMMARY = "Documentation for texlive-luacolor"
DESCRIPTION = "This package includes the documentation for texlive-luacolor"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.17svn57829"

RPM_NAME = "texlive-luacolor-doc-2023.208.1.17svn57829-53.1.noarch.rpm"
RPM_HASH = "40da052e46a706969bb75980050ba1491efb1f180d395a2c4b8c2194869bdf14449e21997c8d076f5a38e960391051473932936212549cff25f00a498f55ff74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luacolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
