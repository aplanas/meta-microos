SUMMARY = "A LaTeX2e class for making multiple choice questionnaires"
DESCRIPTION = "QCM is a package for making multiple choices questionnaires \
under LaTeX2e ('QCM' is the French acronym for this style of \
test). A special environment allows you to define questions and \
possible answers. You can specify which answers are correct and \
which are not. QCM not only formats the questions for you, but \
also generates a 'form' (a grid that your students will have to \
fill in), and a 'mask' (the same grid, only with correct \
answers properly checked in). You can then print the mask on a \
slide and correct the questionnaires more easily by \
superimposing the mask on top of students' forms. QCM can also \
typeset exam corrections automatically, and comes with support \
for AUC-TeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn63833"

RPM_NAME = "texlive-qcm-2023.201.2.1svn63833-53.2.noarch.rpm"
RPM_HASH = "15c78c7cc229ee684bd789d3831eb4a54a79eb27da94074b8993ba99b0d18fce9f6a74c8a669be20f2915fb8e76f60841dd21a2b5d815695affcc5bc9d3329bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-qcm.cls \
tex-qcm.sty \
texlive-qcm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-tabularx.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
