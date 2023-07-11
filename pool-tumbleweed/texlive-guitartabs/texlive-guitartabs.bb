SUMMARY = "A class for drawing guitar tablatures easily"
DESCRIPTION = "This package provides is a simple LaTeX2e class that allows \
guitarists to create basic guitar tablatures using LaTeX. \
Create music and do not be bothered with macro programming. The \
class depends on the LaTeX packages geometry, harmony, \
inputenc, intcalc, musixtex, tikz, and xifthen, as well as the \
article class."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn48102"

RPM_NAME = "texlive-guitartabs-2023.201.svn48102-53.2.noarch.rpm"
RPM_HASH = "b880c672260c9688b8052a09777150f06b4750fe491d865eddaa197afce77785ee0447a4b8fdbf018bfa6a8f68f79a16e059abf60f304068cc0f76c29d3f4d77"
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
