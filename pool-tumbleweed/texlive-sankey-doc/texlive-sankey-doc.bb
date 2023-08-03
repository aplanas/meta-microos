SUMMARY = "Documentation for texlive-sankey"
DESCRIPTION = "This package includes the documentation for texlive-sankey"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0.1svn61874"

RPM_NAME = "texlive-sankey-doc-2023.209.3.0.1svn61874-54.1.noarch.rpm"
RPM_HASH = "98da921c10c759996d25e95a76dd8ef1cf8b01045ae75f066b9ae98df1fa8c3ad82fcfade3e762dc620c1261d751f201850c78bb9738cd5560e308858989915e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sankey-doc"

RDEPENDS:${PN} += ""

inherit rpm
