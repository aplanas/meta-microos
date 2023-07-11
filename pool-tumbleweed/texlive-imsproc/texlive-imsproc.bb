SUMMARY = "Typeset IMS conference proceedings"
DESCRIPTION = "The class typesets papers for IMS (Iranian Mathematical \
Society) conference proceedings. The class uses the XePersian \
package."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1svn29803"

RPM_NAME = "texlive-imsproc-2023.208.0.0.1svn29803-53.1.noarch.rpm"
RPM_HASH = "33357da0bc73ebca64d3d10dd2ef6326e2cc4317738386b5d6711adf68d393d66d9bddef21839f868a0233e5a2f1759cee72ad39ea27415637381cface3f3a59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-imsproc.cls \
texlive-imsproc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
