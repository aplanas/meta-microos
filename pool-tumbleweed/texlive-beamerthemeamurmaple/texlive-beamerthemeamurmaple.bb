SUMMARY = "A new modern beamer theme"
DESCRIPTION = "This Beamer theme is a suitable theme for my use of Beamer in \
applied mathematics research. It meets my needs in my work. \
However, if you like this theme, and if you want to ask for or \
make improvements, don't hesitate to write to me!"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn65698"

RPM_NAME = "texlive-beamerthemeamurmaple-2023.209.1.2svn65698-54.1.noarch.rpm"
RPM_HASH = "de8a655a517e3460ff03f4a23fe2573b6766e593b3961c911540d3d73a9d4fe9da267dfcb130b46255cbf51d4d28e96a365a7f8c66a5e32654fef04fdc081824"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerthemeAmurmaple.sty \
texlive-beamerthemeamurmaple"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-iftex.sty \
tex-luamesh.sty \
tex-multicol.sty \
tex-pgfpages.sty \
tex-tcolorbox.sty \
tex-xfp.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
