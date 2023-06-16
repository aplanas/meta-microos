SUMMARY = "A class file to typeset exams"
DESCRIPTION = "This LaTeX document class has been designed to typeset exams."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn44960"

RPM_NAME = "texlive-cesenaexam-2023.201.0.0.2svn44960-52.1.noarch.rpm"
RPM_HASH = "02766f40d97a08937c9ec5dac0328d863ee95ca61e82dce0590a17105e909353426dd6a03cd49ef0a7ec5091f85cf0aa2b004c12a16b5719dbcfc7b5fad87c67"
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
