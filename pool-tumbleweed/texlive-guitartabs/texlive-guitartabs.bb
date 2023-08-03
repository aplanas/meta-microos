SUMMARY = "A class for drawing guitar tablatures easily"
DESCRIPTION = "This package provides is a simple LaTeX2e class that allows \
guitarists to create basic guitar tablatures using LaTeX. \
Create music and do not be bothered with macro programming. The \
class depends on the LaTeX packages geometry, harmony, \
inputenc, intcalc, musixtex, tikz, and xifthen, as well as the \
article class."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn48102"

RPM_NAME = "texlive-guitartabs-2023.209.svn48102-54.1.noarch.rpm"
RPM_HASH = "9b0e86db05f0d0076b70be0a3e6c5f4b008506d3595c2a3dea7d2a9f6a7adfa66b87b607df870c238abda9a02927c794a7ef94682a85f04a69b8c4b98bca36ed"
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
