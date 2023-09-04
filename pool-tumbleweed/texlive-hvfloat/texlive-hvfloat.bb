SUMMARY = "Controlling captions, fullpage and doublepage floats"
DESCRIPTION = "This package defines a macro to place objects (tables and \
figures) and their captions in different positions with \
different rotating angles within a float. All objects and \
captions can be framed. The main command is \\hvFloat{float \
type}{floating object}{caption}{label}; a simple example is \
\\hvFloat{figure}{\\includegraphics{rose}}{Caption}{fig:0}. \
Options are provided to place captions to the right or left, \
and rotated. Setting nonFloat=true results in placing the float \
here."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.45svn65671"

RPM_NAME = "texlive-hvfloat-2023.209.2.45svn65671-54.1.noarch.rpm"
RPM_HASH = "ff4c8618b2cb1c504323b518dcb45aaffb2ad375e5963b773142ae4579ddc0bdb9b81b44f36e7b6afd6ce3d6eb18e7662bc14109816e4619b8cc55106fc48ce6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hvfloat-fps.sty \
tex-hvfloat.sty \
texlive-hvfloat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-atbegshi.sty \
tex-caption.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifoddpage.sty \
tex-marginnote.sty \
tex-multido.sty \
tex-picture.sty \
tex-stfloats.sty \
tex-subcaption.sty \
tex-trimclip.sty \
tex-varwidth.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
