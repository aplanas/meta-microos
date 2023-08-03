SUMMARY = "A LaTeX package for preparing manuscripts for the journal EMISA"
DESCRIPTION = "The EMISA LaTeX package is provided for preparing manuscripts \
for submission to EMISA (Enterprise Modelling and Information \
Systems Architectures), and for preparing accepted submissions \
for publication as well as for typesetting the final document \
by the editorial office. Articles in EMISA are published online \
at EMISA in the Portable Document Format (PDF)."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3.0svn60068"

RPM_NAME = "texlive-emisa-2023.209.2.3.0svn60068-54.1.noarch.rpm"
RPM_HASH = "d55fb7c7e5d001ad8a90d461a062b7c6b0fa00ac2c536224a74353459ab02d0408a1cda77eb6751445f21676d484ae6ee76c95e4214edc69aa0e8d54dd3a5ebc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-emisa.bbx \
tex-emisa.cbx \
tex-emisa.cls \
texlive-emisa"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-article.cls \
tex-authoryear-comp.cbx \
tex-authoryear.bbx \
tex-babel.sty \
tex-booktabs.sty \
tex-calc.sty \
tex-caption.sty \
tex-cleveref.sty \
tex-csquotes.sty \
tex-environ.sty \
tex-eso-pic.sty \
tex-etoolbox.sty \
tex-float.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-inputenc.sty \
tex-listings.sty \
tex-microtype.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-newtxtt.sty \
tex-ntheorem.sty \
tex-paralist.sty \
tex-placeins.sty \
tex-textcomp.sty \
tex-twoopt.sty \
tex-url.sty \
tex-xcolor.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
