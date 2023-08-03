SUMMARY = "Create PDF and SVG animations from graphics files and inline graphics"
DESCRIPTION = "The package provides an interface to create portable, \
JavaScript driven PDF and SVG animations from sets of graphics \
files or from inline graphics, such as LaTeX picture \
environment, PSTricks or pgf/TikZ generated pictures, or just \
from typeset text."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64401"

RPM_NAME = "texlive-animate-2023.209.svn64401-55.1.noarch.rpm"
RPM_HASH = "2a1b57b9a686ee8c2159b4408ac5b4ed5bc0d409b2501abd109f4acc7231b1363cfc2728e3e6ea031e01e754d35254cb0d5d651f1e1069967a2c005a2ee06a33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-animate.sty \
texlive-animate"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-graphics.sty \
tex-ifdraft.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-ocgbase.sty \
tex-pdfbase.sty \
tex-zref-abspage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
