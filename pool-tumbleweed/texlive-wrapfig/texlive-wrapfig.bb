SUMMARY = "Produces figures which text can flow around"
DESCRIPTION = "Allows figures or tables to have text wrapped around them. Does \
not work in combination with list environments, but can be used \
in a parbox or minipage, and in twocolumn format. Supports the \
float package."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.6svn61719"

RPM_NAME = "texlive-wrapfig-2023.209.3.6svn61719-53.2.noarch.rpm"
RPM_HASH = "5065225b69e2689a9e42510bc918fcfc87ef47324e7dad0a629b43dbc2191e1753f39138d32442c1df5ad44a7bd74e870d8feb667f701c9b9dc3b578ceb34366"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wrapfig.sty \
texlive-wrapfig"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
