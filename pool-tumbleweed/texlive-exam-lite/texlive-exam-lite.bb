SUMMARY = "Quicker preparation of exams in LaTeX"
DESCRIPTION = "This template is devoted to the quicker preparation of exams in \
LaTeX. Its main features are: Minimalistic design. Include the \
custom logo of the affiliation. Predefined commands for a \
subject, study year, study program, exam type, place of exam, \
date. Many macros contained in this package speed up the \
process of preparing the necessary ingredients for the exam. \
Automatic calculation of total points."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65754"

RPM_NAME = "texlive-exam-lite-2023.201.svn65754-52.1.noarch.rpm"
RPM_HASH = "6d3fbfda18aba5c93caacc5bb6275fc12e6d25a161828ea924c5ed3e7ef397edab8f5baae6f0660f0e29b18e6724252b864ce07da522c317a88252a65983d3a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exam-lite.cls \
texlive-exam-lite"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-babel.sty \
tex-datetime.sty \
tex-enumerate.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-framed.sty \
tex-graphicx.sty \
tex-inputenc.sty \
tex-lipsum.sty \
tex-parskip.sty \
tex-totcount.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
