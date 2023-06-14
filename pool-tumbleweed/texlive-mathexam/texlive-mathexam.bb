SUMMARY = "Package for typesetting exams"
DESCRIPTION = "The package can help you typeset exams (mostly in mathematics \
and related disciplines where students are required to show \
their calculations followed by one or more short answers). It \
provides commands for inclusion of space for calculations, as \
well as commands for automatic creation of 'answer spaces'. In \
addition, the package will automatically create page headers \
and footers, and will let you include instructions and space \
for students to put their name."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.00svn15878"

RPM_NAME = "texlive-mathexam-2023.201.1.00svn15878-52.1.noarch.rpm"
RPM_HASH = "a7d46e270b16b288181ab8d13194b2551418e0be01c686b40ccb142c6ac64a8243f32f02d092e389614035537f053c11a184c343e788f061f90182c35c445228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathexam.sty \
texlive-mathexam"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyhdr.sty \
tex-ifthen.sty \
tex-lastpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
