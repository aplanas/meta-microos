SUMMARY = "Write on grid lines"
DESCRIPTION = "An environment to create grids (type 5x5 or Seyes or Ruled) and \
commands to write texts 'right' on the lines."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.2svn65700"

RPM_NAME = "texlive-writeongrid-2023.201.0.0.1.2svn65700-52.2.noarch.rpm"
RPM_HASH = "efdaeb05dec3c7913cf8ee9982fa69c4ef264262cc0085b487afeb476fbe1b730efb9afb26d6e934fb51e844e09bb73398972f6bbe3552eff41d2918cdf5542e"
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
