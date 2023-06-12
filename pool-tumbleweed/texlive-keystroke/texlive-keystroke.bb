SUMMARY = "Graphical representation of keys on keyboard"
DESCRIPTION = "A LaTeX package which provides macros for the graphical \
representation of the keys on a computer keyboard."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.6svn17992"

RPM_NAME = "texlive-keystroke-2023.201.1.6svn17992-55.1.noarch.rpm"
RPM_HASH = "2a8929c3bfe6298cd761106d696acb33b3805256d14851a68fc293e6b3bd01d3d0f11435e75825cf1141a834af0b446839ad45ce30420756207e31a4951ab309"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(keystroke.sty) \
texlive-keystroke"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(graphics.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
