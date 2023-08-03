SUMMARY = "Documentation for texlive-adtrees"
DESCRIPTION = "This package includes the documentation for texlive-adtrees"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn51618"

RPM_NAME = "texlive-adtrees-doc-2023.209.1.1svn51618-55.1.noarch.rpm"
RPM_HASH = "1892c55db9f91024d02cd1e7186ab04ab0436a5ee0e1b9b0ab498aea39957854a670ffae366f9d82f7aae0ebcab97392932cb0fd2d8b6fa340ddc685a0830036"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adtrees-doc"

RDEPENDS:${PN} += ""

inherit rpm
