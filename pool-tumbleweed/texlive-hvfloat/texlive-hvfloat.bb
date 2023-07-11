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

PV = "2023.208.2.45svn65671"

RPM_NAME = "texlive-hvfloat-2023.208.2.45svn65671-53.1.noarch.rpm"
RPM_HASH = "4df37e1b4fe5b9b1e9a060be9e09c0014452d519b7f1eba2eb2be74299bf94f0367be36df2009ad0fe42e52c7092dfe48512ad47d2cea669c4c3f4a0475a501a"
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
