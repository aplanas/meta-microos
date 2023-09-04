SUMMARY = "Write on grid lines"
DESCRIPTION = "An environment to create grids (type 5x5 or Seyes or Ruled) and \
commands to write texts 'right' on the lines."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.2svn65700"

RPM_NAME = "texlive-writeongrid-2023.209.0.0.1.2svn65700-53.2.noarch.rpm"
RPM_HASH = "a7f6834709ce755c15820a402e857bb85a6d67d6fec209e653fb834731b290effd316e41e168b320cdb4a6c4acd32dda3a7290156e8141262b4d7c9efbafe51a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-WriteOnGrid.sty \
texlive-writeongrid"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-simplekv.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
