SUMMARY = "Typeset Chinese chess with l3draw"
DESCRIPTION = "This LaTeX3 package based on l3draw provides macros and an \
environment for Chinese chess manual writing."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.0svn63276"

RPM_NAME = "texlive-chinesechess-2023.201.1.2.0svn63276-53.1.noarch.rpm"
RPM_HASH = "a8ea3e63f70c4f326dd653e98552a913d3164b395747022f5940a0159cfd25bb15487db90c6fe91f69b74fe270db6a9241a3b77a5f24a8ea38a3f0b6e22ea1b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chinesechess.sty \
texlive-chinesechess"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3draw.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
