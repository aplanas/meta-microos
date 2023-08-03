SUMMARY = "A single TikZ node for the whole page"
DESCRIPTION = "The package provides special PGF/TikZ nodes for the text, \
marginpar, footer and header area of the current page. They are \
inspired by the 'current page' node defined by PGF/TikZ itself."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64967"

RPM_NAME = "texlive-tikzpagenodes-2023.209.1.1svn64967-53.1.noarch.rpm"
RPM_HASH = "2fae053e7a44625d4dc1acfdd752e333977ccfe2c39501327af6b78a20961cb6110025b359b3b2baab276e74ee49ea56d068d585d41ae7ee4069bba5f644f8c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzpagenodes.sty \
texlive-tikzpagenodes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifoddpage.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
