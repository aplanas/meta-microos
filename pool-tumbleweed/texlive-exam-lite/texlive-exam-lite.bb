SUMMARY = "Quicker preparation of exams in LaTeX"
DESCRIPTION = "This template is devoted to the quicker preparation of exams in \
LaTeX. Its main features are: Minimalistic design. Include the \
custom logo of the affiliation. Predefined commands for a \
subject, study year, study program, exam type, place of exam, \
date. Many macros contained in this package speed up the \
process of preparing the necessary ingredients for the exam. \
Automatic calculation of total points."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65754"

RPM_NAME = "texlive-exam-lite-2023.209.svn65754-53.1.noarch.rpm"
RPM_HASH = "056115aec948d5b9f2fbbd3b90c04b52d4085cba6f52dd65f7da3e7b05f0b5f7bbb70a459842e733ec8b2e0254ca683ad24382a234519dfa2b56109d29ee624a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exam-lite.cls \
texlive-exam-lite"

RDEPENDS:${PN} += "/usr/bin/sh \
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
