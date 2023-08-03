SUMMARY = "Optimality Theory tableaux in LaTeX"
DESCRIPTION = "The package makes it easy to create beautiful \
optimality-theoretic tableaux. The LaTeX source is visually \
very similar to a formatted tableau, which makes working with \
the source code painless (well, less painful). A variety of \
stylistic variants are available to suit personal taste. The \
package requires xstring, amssymb, bbding, suffix, colortbl, \
rotating, hhline (optionally), arydshln, and tipa (optionally)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn59318"

RPM_NAME = "texlive-ot-tableau-2023.209.svn59318-55.1.noarch.rpm"
RPM_HASH = "30f1612807acbdb872dd8997de15b36ec9723a04ed83425a985973ff7b2d867db5d8ac2227910408461dd05d4e182a5065f7f901e6546c2eceab4836cc1dc374"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ot-tableau.sty \
texlive-ot-tableau"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-arydshln.sty \
tex-bbding.sty \
tex-colortbl.sty \
tex-hhline.sty \
tex-rotating.sty \
tex-suffix.sty \
tex-tipa.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
