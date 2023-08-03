SUMMARY = "Documentation for texlive-nodetree"
DESCRIPTION = "This package includes the documentation for texlive-nodetree"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2.1svn65298"

RPM_NAME = "texlive-nodetree-doc-2023.209.2.2.1svn65298-55.1.noarch.rpm"
RPM_HASH = "b0777356a4a87c49b1f66f8fc98d64b092edb3a692b546dc2c1df31d7e4eb424329d139a333f624ca10b825b4095ca5d53dddc58c9ce36cf1a22fcfde99ee1c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nodetree-doc"

RDEPENDS:${PN} += ""

inherit rpm
