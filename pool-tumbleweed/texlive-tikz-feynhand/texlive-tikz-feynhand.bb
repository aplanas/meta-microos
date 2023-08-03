SUMMARY = "Feynman diagrams with TikZ"
DESCRIPTION = "This package lets you draw Feynman diagrams using TikZ. It is a \
low-end modification of the TikZ-Feynman package, one of whose \
principal advantages is the automatic generation of diagrams, \
for which it needs LuaTex. TikZ-FeynHand only provides the \
manual mode and hence runs in LaTeX without any reference to \
LuaTeX. In addition it provides some new styles for vertices \
and propagators, alternative shorter keywords in addition to \
TikZ-Feynman's longer ones, some shortcut commands for quickly \
customizing the diagrams' look, and the new feature of putting \
one propagator 'on top' of another. It also includes a quick \
user guide for getting started, with many examples and a \
5-minute introduction to TikZ."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1.0svn51915"

RPM_NAME = "texlive-tikz-feynhand-2023.209.1.1.0svn51915-53.1.noarch.rpm"
RPM_HASH = "73740f6ae6b65e13802486a67d8742811aa630921e84a4aa665b3b50167c30a73c7df5a4feecbc7602592c7b3c4d9c156a6050a0a42696a60807bf7dfd5b7c64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-feynhand.sty \
tex-tikzfeynhand.keys.code.tex \
tex-tikzlibraryfeynhand.code.tex \
texlive-tikz-feynhand"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfopts.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
