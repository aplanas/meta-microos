SUMMARY = "Beamer document class for MedStar Health Research Institute"
DESCRIPTION = "This is a beamer template for MedStar Health presentations. It \
includes sample presentations using both .tex files and .rnw \
files. The document class is obviously compatible with both. \
The advantage of the .rnw file is that it can be used with \
knitr such that you can weave your R code with your \
presentation."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn38828"

RPM_NAME = "texlive-medstarbeamer-2023.208.svn38828-53.1.noarch.rpm"
RPM_HASH = "8caa5e57ca92eb6560b08c0096cf2f4c756f71f00750c563c4474a59e73dde57b755680a99b1582435d38200457aca27e0a02bfc832f6343458bb80644ccecbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeMedStarColors.sty \
tex-medstarbeamer.cls \
texlive-medstarbeamer"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-anysize.sty \
tex-background.sty \
tex-booktabs.sty \
tex-cancel.sty \
tex-enumerate.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-pgf.sty \
tex-soul.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
