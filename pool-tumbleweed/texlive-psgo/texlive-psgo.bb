SUMMARY = "Typeset go diagrams with PSTricks"
DESCRIPTION = "The psgo package"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.17svn15878"

RPM_NAME = "texlive-psgo-2023.209.0.0.17svn15878-53.1.noarch.rpm"
RPM_HASH = "58bdea0e7a6093f1816c791ca85428678ec283aee09a9d7ddfc13a44035c0d02c074ebccf5c1364487aa3e834c54d4fa9c3b49c5c942ec969387523f3d10a9d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-psgo.sty \
texlive-psgo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-pst-node.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
