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

PV = "2023.201.2.7svn61596"

RPM_NAME = "texlive-esami-2023.201.2.7svn61596-53.2.noarch.rpm"
RPM_HASH = "83dda8a2ed2f5353ef87dbdc4f885ef1416ef1274752067a31d6a14bc50e6d470eedf91981e784468d21fe807709a6a4832a72d1afe3196ab26f425fdf07611a"
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
