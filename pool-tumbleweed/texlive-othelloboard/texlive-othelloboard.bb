SUMMARY = "Typeset Othello (Reversi) diagrams of any size, with annotations"
DESCRIPTION = "The package enables the user to generate high-quality Othello \
(also known as Reversi) board diagrams of any size. The \
diagrams support annotations, including full game transcripts. \
Automated board or transcript creation, from plain text formats \
standard to WZebra (and other programs) is also supported."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn23714"

RPM_NAME = "texlive-othelloboard-2023.201.1.2svn23714-54.1.noarch.rpm"
RPM_HASH = "43e2051de5297879a2bcd85dd2853e23c5bcce54adb2bfed17102a5b61a8d3d4379ca7feae6ed3d730d97c4a7a66065d35507ab1bea57cd65bbef909d4aeea11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-othelloboard.sty \
texlive-othelloboard"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-pict2e.sty \
tex-stringstrings.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
