SUMMARY = "Typeset Othello (Reversi) diagrams of any size, with annotations"
DESCRIPTION = "The package enables the user to generate high-quality Othello \
(also known as Reversi) board diagrams of any size. The \
diagrams support annotations, including full game transcripts. \
Automated board or transcript creation, from plain text formats \
standard to WZebra (and other programs) is also supported."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn23714"

RPM_NAME = "texlive-othelloboard-2023.209.1.2svn23714-55.1.noarch.rpm"
RPM_HASH = "65aebd4f84d9e2f17094e9d9f68e05b4f84a340e293d74ea5f6725118f865b40272db60b4a6cbc8ab7f59a7ae75a82ef2f5e3018abf4a4156db0a26e175217fa"
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
