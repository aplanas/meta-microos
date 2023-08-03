SUMMARY = "Documentation for texlive-showkerning"
DESCRIPTION = "This package includes the documentation for texlive-showkerning"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn63708"

RPM_NAME = "texlive-showkerning-doc-2023.209.0.0.1svn63708-54.1.noarch.rpm"
RPM_HASH = "2c8e633cbb04e8610a6bd83d107d406e68c6dc5f677c8b73d444e1181dd54e1b8cd883af7d8e53762ca85cbcb8745daf26b903ad62297da2c992eca6abfe56c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-showkerning-doc"

RDEPENDS:${PN} += ""

inherit rpm
