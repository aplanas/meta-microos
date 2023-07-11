SUMMARY = "LaTeX support for Croatian documents"
DESCRIPTION = "This package simplifies creation of new documents for the \
(average) Croatian user. As an example, a class file hrdipl.cls \
(designed for the graduation thesis at the University of \
Zagreb) and sample thesis documents are included."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.23svn18020"

RPM_NAME = "texlive-hrlatex-2023.208.0.0.23svn18020-53.1.noarch.rpm"
RPM_HASH = "23c67d3ce13d2d640ccbfadac41fe45bac3e81a221cb303cfa3b384f3b7ff87dcf013dab6e34d68e35c897b42ad0c8269cb9c9fa9a1d680d87e4c57b50e4e819"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fsbispit.cls \
tex-fsbmath.sty \
tex-hrlatex.sty \
texlive-hrlatex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amsopn.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-babel.sty \
tex-calc.sty \
tex-cancel.sty \
tex-enumerate.sty \
tex-fontenc.sty \
tex-framed.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-multicol.sty \
tex-optional.sty \
tex-paralist.sty \
tex-txfonts.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
