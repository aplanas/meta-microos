SUMMARY = "A class for drawing guitar tablatures easily"
DESCRIPTION = "This package provides is a simple LaTeX2e class that allows \
guitarists to create basic guitar tablatures using LaTeX. \
Create music and do not be bothered with macro programming. The \
class depends on the LaTeX packages geometry, harmony, \
inputenc, intcalc, musixtex, tikz, and xifthen, as well as the \
article class."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn48102"

RPM_NAME = "texlive-guitartabs-2023.209.svn48102-54.2.noarch.rpm"
RPM_HASH = "a7cc627d60fb65ab5f9eb68cc997c0e93217becd403d466a4b1674d1b9ea32a917923477efc94c3c122010662d1bbae7ed0b5f7d2036ca2fe890a908dad7f755"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-guitartabs.cls \
texlive-guitartabs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-geometry.sty \
tex-harmony.sty \
tex-inputenc.sty \
tex-intcalc.sty \
tex-musixtex.sty \
tex-tikz.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
