SUMMARY = "Mimic the screen of older Texas Instruments calculators"
DESCRIPTION = "This package mimics the screen of older Texas Instruments dot \
matrix display calculators, specifically the TI-82 STATS. It \
relies on the lcd and xcolor packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn62602"

RPM_NAME = "texlive-tiscreen-2023.209.svn62602-53.1.noarch.rpm"
RPM_HASH = "dd2d38f77a64c255a4c11b2bafba777b61c3a7116979efa4a60a9ba4bae7e11bb808d5995f483208eb2a37d807b3f6a90a280ee5b2792a4174c81c2d6c20307b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tiscreen.sty \
texlive-tiscreen"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-lcd.sty \
tex-tcolorbox.sty \
tex-textgreek.sty \
tex-tikz.sty \
tex-tipa.sty \
tex-wasysym.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
