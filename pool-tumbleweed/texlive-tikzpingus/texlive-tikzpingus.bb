SUMMARY = "Penguins with TikZ"
DESCRIPTION = "tikzpingus is a package similar to tikzducks but with penguins \
and a vast set of gadgets and extras (capable of changing the \
wing-positions, body-types, and more)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn64199"

RPM_NAME = "texlive-tikzpingus-2023.209.1.0svn64199-53.1.noarch.rpm"
RPM_HASH = "b2a9fb911ea14f3ad5c46033c66d8cdda67c1c83d439d3a612219036e8214b8eeceaaefae2b8fbbf0bab639ecf3f448b1d226a0d4b6bc9ab00aee31d495931c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzpingus-christmas.lib.tex \
tex-tikzpingus-cloak.lib.tex \
tex-tikzpingus-devil.lib.tex \
tex-tikzpingus-emotions.lib.tex \
tex-tikzpingus-flags.lib.tex \
tex-tikzpingus-formal.lib.tex \
tex-tikzpingus-fun.lib.tex \
tex-tikzpingus-glasses.lib.tex \
tex-tikzpingus-hats.lib.tex \
tex-tikzpingus-horse.lib.tex \
tex-tikzpingus-magic.lib.tex \
tex-tikzpingus-medieval.lib.tex \
tex-tikzpingus-movement.lib.tex \
tex-tikzpingus-safe.lib.tex \
tex-tikzpingus-science-fiction.lib.tex \
tex-tikzpingus-shirts.lib.tex \
tex-tikzpingus-signs.lib.tex \
tex-tikzpingus-sport.lib.tex \
tex-tikzpingus-technology.lib.tex \
tex-tikzpingus.sty \
texlive-tikzpingus"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
