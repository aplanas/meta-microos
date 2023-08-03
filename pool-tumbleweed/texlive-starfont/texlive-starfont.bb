SUMMARY = "The StarFont Sans astrological font"
DESCRIPTION = "The package contains StarFontSans and StarFontSerif, two \
public-domain astrological fonts designed by Anthony I.P. Owen, \
and the appropriate macros to use them with TeX and LaTeX. The \
fonts are supplied both in the original TrueType Format and in \
Adobe Type 1 format."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.2svn19982"

RPM_NAME = "texlive-starfont-2023.209.1.2svn19982-58.1.noarch.rpm"
RPM_HASH = "58d93f7e6937c80ca8441766908e3beba473210c3b5b33e689b5341813cbaf3473bdcce3004ba43c0cdbeb697a5c330755596415764c8306766c27219083dfe9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fstr8x.tfm \
tex-fsts8x.tfm \
tex-starfont.map \
tex-starfont.sty \
texlive-starfont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-starfont-fonts"

inherit rpm
