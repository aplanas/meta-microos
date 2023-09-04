SUMMARY = "Unofficial template of the DHBW Mannheim"
DESCRIPTION = "This package provides an unofficial template of the DHBW \
Mannheim for the creation of bachelor thesis, studies or \
project work with LaTeX. The aim of the package is the quick \
creation of a basic framework without much effort."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.2svn57773"

RPM_NAME = "texlive-iodhbwm-2023.209.1.2.2svn57773-54.1.noarch.rpm"
RPM_HASH = "935f761475ef0acc77ba4829df050158606b7a8410cb0fa11e427a202e785753be44c208cc193918bde1cff5448bffd1b3efb19147ee93b5497a375af21b684e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-iodhbwm-i18n.def \
tex-iodhbwm-templates.sty \
tex-iodhbwm.cls \
texlive-iodhbwm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-auxhook.sty \
tex-babel.sty \
tex-blindtext.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-csquotes.sty \
tex-etoolbox.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-lipsum.sty \
tex-listings.sty \
tex-lmodern.sty \
tex-mathtools.sty \
tex-microtype.sty \
tex-pgfopts.sty \
tex-scrhack.sty \
tex-scrlfile.sty \
tex-setspace.sty \
tex-siunitx.sty \
tex-tabularx.sty \
tex-tcolorbox.sty \
tex-totalcount.sty \
tex-xcolor.sty \
tex-xpatch.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
