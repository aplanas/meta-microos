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

PV = "2023.201.1.1.0svn51915"

RPM_NAME = "texlive-tikz-feynhand-2023.201.1.1.0svn51915-52.1.noarch.rpm"
RPM_HASH = "04fe3a761b4a731c4f7002b0cccf6e513afa34dd766c629e825f82b5d3e6fc1b5016e7c036a46e665724de533a394dd46697687639fed352f960de403f38dcc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-feynhand.sty \
tex-tikzfeynhand.keys.code.tex \
tex-tikzlibraryfeynhand.code.tex \
texlive-tikz-feynhand"

RDEPENDS:${PN} += "/bin/sh \
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
