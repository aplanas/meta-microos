SUMMARY = "Graphical representation of keys on keyboard"
DESCRIPTION = "A LaTeX package which provides macros for the graphical \
representation of the keys on a computer keyboard."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.6svn17992"

RPM_NAME = "texlive-keystroke-2023.209.1.6svn17992-56.1.noarch.rpm"
RPM_HASH = "ef0295d2ff2dfd5ee320f7acab79a28ec9c1cb0cda994328fe112875ee44964ce66ab30547701c17fc28a5940046d2f69cb365b57ab876c17689143e270e13d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-keystroke.sty \
texlive-keystroke"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
