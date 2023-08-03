SUMMARY = "Draw UML Sequence Diagrams"
DESCRIPTION = "LaTeX macros to draw UML diagrams using pgf"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.7svn55342"

RPM_NAME = "texlive-pgf-umlsd-2023.209.0.0.7svn55342-52.1.noarch.rpm"
RPM_HASH = "769f656ca048ed5d6a7b58b6b1798fd8a781674f864a921cab6b3170db2f52838ed198d4e508f0c4dbdff14e89b4b19eb276643e92b9b4f4370bb498a317f7a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgf-umlsd.sty \
texlive-pgf-umlsd"

RDEPENDS:${PN} += "/usr/bin/sh \
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
