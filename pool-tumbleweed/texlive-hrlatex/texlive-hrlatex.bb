SUMMARY = "LaTeX support for Croatian documents"
DESCRIPTION = "This package simplifies creation of new documents for the \
(average) Croatian user. As an example, a class file hrdipl.cls \
(designed for the graduation thesis at the University of \
Zagreb) and sample thesis documents are included."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.23svn18020"

RPM_NAME = "texlive-hrlatex-2023.209.0.0.23svn18020-54.1.noarch.rpm"
RPM_HASH = "c83dc9bd474d52836d6e9aa1825ccc8370f8364f6f2ba0a1b9ddfe5ed1bfb5edbea28823d58ddc1f40ce4f23e79c4149c74678ce71b4ffe965dda85d24d775fa"
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
