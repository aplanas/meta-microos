SUMMARY = "Documentation for texlive-context-layout"
DESCRIPTION = "This package includes the documentation for texlive-context-layout"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-layout-doc-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "259793e6b53d90402a0c59dc87f85c84c43022af3cbb6a96f5dbbddc064c24bf110b1dd66f5657767a95ca3ecbc6d3f981f72328d4096418fb30a4516b802d26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-layout-doc"

RDEPENDS:${PN} += ""

inherit rpm
