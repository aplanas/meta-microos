SUMMARY = "Document class for dissertations at the University of Wollongong"
DESCRIPTION = "A document class for higher degree research theses in \
compliance with the specifications of University of Wollongong \
(UoW) theses in the 'Guidelines for Preparation and Submission \
of Higher Degree Research Theses' (March 2006), by the Research \
Student Centre, Research & Innovation Division, UoW."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn19700"

RPM_NAME = "texlive-uowthesis-2023.209.1.0asvn19700-54.1.noarch.rpm"
RPM_HASH = "bc0122534e2650cc0289c9422e4e09de21bee4ba2760db601d893e9a374d8569af5a0b762542fbe9d2e711f915e649609e8cee1fc0d292d3fef2b4b1d47f476d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-UoWthesis.cls \
texlive-uowthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-nextpage.sty \
tex-report.cls \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
