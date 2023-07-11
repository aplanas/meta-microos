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

PV = "2023.208.1.00svn15878"

RPM_NAME = "texlive-mathexam-2023.208.1.00svn15878-53.1.noarch.rpm"
RPM_HASH = "43f17a7c6c8dad4565636d1c4346589c53ba66e4c04a0ca3a2f7850035dbcfa4e92c4ec1181cec6a8368c5bd1f06bdb918e647562c61dc2c5bc57555e658b926"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathexam.sty \
texlive-mathexam"

RDEPENDS:${PN} += "/usr/bin/sh \
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
