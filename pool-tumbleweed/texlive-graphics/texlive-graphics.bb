SUMMARY = "The LaTeX standard graphics bundle"
DESCRIPTION = "This is a collection of LaTeX packages for: producing colour \
including graphics (eg PostScript) files rotation and scaling \
of text in LaTeX documents. It comprises the packages color, \
graphics, graphicx, trig, epsfig, keyval, and lscape."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66204"

RPM_NAME = "texlive-graphics-2023.201.svn66204-53.2.noarch.rpm"
RPM_HASH = "eba5cf92b611b69a471193492757d5b37b2518dc5cadfed564acec8fcf6d872c477e06c908c8ad7defc48795a797eb5808312fbbda3f404d2e3dadb7ba242df5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-color.sty \
tex-dvipdf.def \
tex-dvipsnam.def \
tex-dvipsone.def \
tex-dviwin.def \
tex-emtex.def \
tex-epsfig.sty \
tex-graphics-2017-06-25.sty \
tex-graphics.sty \
tex-graphicx.sty \
tex-keyval.sty \
tex-lscape.sty \
tex-pctex32.def \
tex-pctexhp.def \
tex-pctexps.def \
tex-pctexwin.def \
tex-rotating.sty \
tex-tcidvi.def \
tex-trig.sty \
tex-truetex.def \
texlive-graphics"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.cfg \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-graphics-cfg \
texlive-graphics-def \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
