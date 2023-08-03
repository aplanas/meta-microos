SUMMARY = "Create mathematical manuals for schools"
DESCRIPTION = "This package enables LaTeX users to create math books for \
middle and high schools. It provides commands to create the \
front page of the manual and the chapters. Each chapter can \
consist of three sections: the lesson, the exercises and the \
activities."
LICENSE = "LPPL-1.0"

PV = "2023.209.1svn54080"

RPM_NAME = "texlive-fascicules-2023.209.1svn54080-53.1.noarch.rpm"
RPM_HASH = "09c69c3c7dcc39d7906994223ace030164f38c762f0ffe0195e27e4a221ee812cbdd051615023cca47826618a8e31272cbffeb480f02d6ea11a5dd395966053b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fascicules.sty \
texlive-fascicules"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsthm.sty \
tex-answers.sty \
tex-beamerarticle.sty \
tex-calc.sty \
tex-cleveref.sty \
tex-comment.sty \
tex-enumitem.sty \
tex-environ.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-keyval.sty \
tex-multicol.sty \
tex-nameref.sty \
tex-pgfopts.sty \
tex-scrlayer-scrpage.sty \
tex-tagging.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xcomment.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
