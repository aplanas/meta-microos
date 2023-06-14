SUMMARY = "Concert programmes"
DESCRIPTION = "A class which provides the necessary macros to prepare a \
(classical) concert programme; a sample is provided."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn18791"

RPM_NAME = "texlive-concprog-2023.201.svn18791-53.1.noarch.rpm"
RPM_HASH = "4e73acd65f35fc359ca23ba810682f50da2154ffab4050034c4d45e2813ec0bb9f631624dcc744a3280961b550e14466c4b370ef99bd3a56ee363ed6f20925b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ConcProg.cls \
texlive-concprog"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
