SUMMARY = "Documentation for texlive-fcavtex"
DESCRIPTION = "This package includes the documentation for texlive-fcavtex"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn38074"

RPM_NAME = "texlive-fcavtex-doc-2023.209.1.1svn38074-53.1.noarch.rpm"
RPM_HASH = "f64419f03e2d9e4bd67288cb4206032d03ede6904fd9952e702c64c49502ade41c5d0ac20c02e36577c48e384ee00a46b32ac1a50eee31587bdda0ccc9da7948"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-fcavtex-doc-pt \
texlive-fcavtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
