SUMMARY = "Computer Science thesis class for University of Dortmund"
DESCRIPTION = "At the department of computer science at the University of \
Dortmund there are cardboard cover pages for research or \
internal reports like master/phd-theses. The main function of \
this LaTeX2e document-class is a replacement for the \\maketitle \
command to typeset a title page that is adjusted to these cover \
pages."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2msvn21340"

RPM_NAME = "texlive-fbithesis-2023.201.1.2msvn21340-52.1.noarch.rpm"
RPM_HASH = "2b949c7af067b0cc75bc564e9093f7b0d79c329b2ed30c63ff1dd56bda718cfa990bf37411fed5c7a0f69fba037220d6a74cc4c091b88455ceb8e3980d0bf8ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fbithesis.cfg \
tex-fbithesis.cls \
texlive-fbithesis"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
