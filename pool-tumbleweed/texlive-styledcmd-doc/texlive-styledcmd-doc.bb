SUMMARY = "Documentation for texlive-styledcmd"
DESCRIPTION = "This package includes the documentation for texlive-styledcmd"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.0svn65262"

RPM_NAME = "texlive-styledcmd-doc-2023.209.2.0svn65262-58.1.noarch.rpm"
RPM_HASH = "86077328b79342fa629d4e3b27a50723ac82e2e436a218825db5993de34c268a815268bf1a9e3f1b1a5cefb950c6675ef27a2c33c2f96192a34b25179f66db69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-styledcmd-doc"

RDEPENDS:${PN} += ""

inherit rpm
