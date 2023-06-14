SUMMARY = "Write on grid lines"
DESCRIPTION = "An environment to create grids (type 5x5 or Seyes or Ruled) and \
commands to write texts 'right' on the lines."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.2svn65700"

RPM_NAME = "texlive-writeongrid-2023.201.0.0.1.2svn65700-52.1.noarch.rpm"
RPM_HASH = "fc51e7c422583ce5930b6f41ab69873597d11bdbd9b2ffc183f949e0aa95c8b5195c036094ed33ed8b441935c21b4e210660c3b977440f60911b8ed85a40359c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-WriteOnGrid.sty \
texlive-writeongrid"

RDEPENDS:${PN} += "/bin/sh \
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
