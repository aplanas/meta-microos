SUMMARY = "Typeset drama using LaTeX"
DESCRIPTION = "A class and style file that supports the typesetting of plays, \
including options for line numbering."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-play-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "22b668f9df8b946534f4dc09169a82828b46eb493a70f1d841c5ef495254906500c926f9b3f7ffa2f927a3700640194ad348fb011a3dffbb3470b55effb12c52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-play.cls \
tex-play.sty \
texlive-play"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
