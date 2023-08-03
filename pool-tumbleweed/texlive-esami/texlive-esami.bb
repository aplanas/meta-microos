SUMMARY = "Typeset exams with scrambled questions and answers"
DESCRIPTION = "The package enables the user to typeset exams with multiple \
choice, open questions and many other types of exercise. Both \
questions and answers may be randomly distributed within the \
exam, and the solutions are typeset automatically. Exercises \
may contain a wide number of random parameters and it is \
possible to do arithmetical operations on them. The package is \
localised in Italian, English, French, German, Greek, Serbian, \
and Spanish."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7svn61596"

RPM_NAME = "texlive-esami-2023.209.2.7svn61596-54.1.noarch.rpm"
RPM_HASH = "c031da90b847985fa9ab1eb880e69fde6880aef29f2674d0e175dbbc3814c9529d8c601c9473fcf66922fd8910a6746ad502e1bf99bbfa606c8a4f505ac1410d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-esami.sty \
texlive-esami"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-array.sty \
tex-auto-pst-pdf.sty \
tex-currfile.sty \
tex-enumerate.sty \
tex-environ.sty \
tex-fp.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-multicol.sty \
tex-pstricks-add.sty \
tex-pstricks.sty \
tex-xargs.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
