SUMMARY = "A class file to typeset exams"
DESCRIPTION = "This LaTeX document class has been designed to typeset exams."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn44960"

RPM_NAME = "texlive-cesenaexam-2023.209.0.0.2svn44960-53.1.noarch.rpm"
RPM_HASH = "6cd9e78a3b6fee5015f43463c3e7e9b900d99af69ef17086df043409ceaaf80b7a0970a252a8904b4a7424edd36626abe311aa34f04314051f3cff7ddfcd9bce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cesenaexam.cls \
tex-cesenaexam.sty \
texlive-cesenaexam"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-circuitikz.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-graphicx.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-pgfkeys.sty \
tex-pgfopts.sty \
tex-tikz.sty \
tex-titlesec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
