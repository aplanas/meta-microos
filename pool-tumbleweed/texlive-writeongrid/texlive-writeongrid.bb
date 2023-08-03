SUMMARY = "Write on grid lines"
DESCRIPTION = "An environment to create grids (type 5x5 or Seyes or Ruled) and \
commands to write texts 'right' on the lines."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.2svn65700"

RPM_NAME = "texlive-writeongrid-2023.209.0.0.1.2svn65700-53.1.noarch.rpm"
RPM_HASH = "dc12afbb04826a64c35de3d93b380c89ec684b88ab152de32f3fc0a88928d5d28088050f6c45891b16ec57d532d8068e4cac98ba8a9562a9d1872a6167a99fce"
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
