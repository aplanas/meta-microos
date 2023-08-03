SUMMARY = "Draw flags of countries using PSTricks"
DESCRIPTION = "This package provides a number of macros for rendering flags of \
countries and their associated artefacts using PSTricks. \
Formatting of the resulting drawings is entirely controlled by \
TeX macros. A good working knowledge of LaTeX should be \
sufficient to design flags of sovereign countries and adapt \
them to create new designs. Features such as color or shape \
customisation and dynamic modifications are possible by \
cleverly adjusting the options supplied to the TeX macros, see \
the documentation for examples. This package requires expl3, \
fp, xfp, xcolor, pstricks and pst-all."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65501"

RPM_NAME = "texlive-pst-flags-2023.209.svn65501-53.1.noarch.rpm"
RPM_HASH = "14f123b1924e198bf0fbbd3d554f1313d6f3bdd4f14f0affc4c909cc06881c760c73726d1712a410d31d8890e30ad723391b38cfd5617effadea2ffda5cf2c0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-Albania-flag-seal.tex \
tex-pst-Angola-flag-seal.tex \
tex-pst-Anguilla-flag-seal.tex \
tex-pst-Barbados-flag-seal.tex \
tex-pst-Dominica-flag.tex \
tex-pst-Egypt-flag-seal.tex \
tex-pst-Eritrea-flag-seal.tex \
tex-pst-Iraq-flag-slogan.tex \
tex-pst-Lesotho-flag-seal.tex \
tex-pst-Malta-flag-seal-corner.tex \
tex-pst-Malta-flag-seal-horse.tex \
tex-pst-Malta-flag-seal-text.tex \
tex-pst-Mongolia-flag-seal.tex \
tex-pst-Nicaragua-flag-seal.tex \
tex-pst-Oman-seal.tex \
tex-pst-Paraguay-seal-wreath.tex \
tex-pst-Saudi-flag-seal.tex \
tex-pst-SriLanka-seal.tex \
tex-pst-Tajikistan-flag-seal-crown.tex \
tex-pst-Uganda-flagseal.tex \
tex-pst-flags-colors-html.sty \
tex-pst-flags.sty \
texlive-pst-flags"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-fp.sty \
tex-pst-all.sty \
tex-pstricks.sty \
tex-xcolor.sty \
tex-xfp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
