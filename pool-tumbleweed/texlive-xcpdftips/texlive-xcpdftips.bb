SUMMARY = "Natbib citations with PDF tooltips"
DESCRIPTION = "This LaTeX package uses pdfcomment and bibentry to surround \
natbib citations with PDF tooltips."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn50449"

RPM_NAME = "texlive-xcpdftips-2023.209.1.1svn50449-53.2.noarch.rpm"
RPM_HASH = "9fca73a4c4740d8dd418d863591e0d06588d7a38eb2772c61868fedc2d6ac2cefacd7a953c3a72d4f551e00de87398545e28d6275c1915f555024348c12db657"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xcpdftips.sty \
texlive-xcpdftips"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bibentry.sty \
tex-calc.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-linegoal.sty \
tex-ocgbase.sty \
tex-pdfbase.sty \
tex-pdfcomment.sty \
tex-tcolorbox.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
