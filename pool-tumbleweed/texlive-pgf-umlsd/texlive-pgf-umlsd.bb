SUMMARY = "Draw UML Sequence Diagrams"
DESCRIPTION = "LaTeX macros to draw UML diagrams using pgf"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.7svn55342"

RPM_NAME = "texlive-pgf-umlsd-2023.201.0.0.7svn55342-51.1.noarch.rpm"
RPM_HASH = "b9457ff2f8e70d24851a1f3ac3dae605690111c332b6e1810694f5d613cc922ba10badaaf1b42d09bdda04b3cabd855ec0ca5a582147cd0cd56f5ebea99dea3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgf-umlsd.sty \
texlive-pgf-umlsd"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-latex \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
