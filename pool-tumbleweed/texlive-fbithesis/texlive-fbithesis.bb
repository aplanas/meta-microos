SUMMARY = "Computer Science thesis class for University of Dortmund"
DESCRIPTION = "At the department of computer science at the University of \
Dortmund there are cardboard cover pages for research or \
internal reports like master/phd-theses. The main function of \
this LaTeX2e document-class is a replacement for the \\maketitle \
command to typeset a title page that is adjusted to these cover \
pages."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2msvn21340"

RPM_NAME = "texlive-fbithesis-2023.209.1.2msvn21340-53.1.noarch.rpm"
RPM_HASH = "b86289106ca81f757af56e269cf3ad902b5edbd1c49e92dcf8a52a10d7729bb25371271c8641bf3c6ba83606566ea999da336b4229d2f000761eef68f06769a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fbithesis.cfg \
tex-fbithesis.cls \
texlive-fbithesis"

RDEPENDS:${PN} += "/usr/bin/sh \
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
