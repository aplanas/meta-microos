SUMMARY = "Easy generation of timing diagrams as TikZ pictures"
DESCRIPTION = "This package provides macros and an environment to generate \
timing diagrams (digital waveforms) without much effort. The \
TikZ package is used to produce the graphics. The diagrams may \
be inserted into text (paragraphs, \\hbox, etc.) and into \
tikzpictures. A tabular-like environment is provided to produce \
larger timing diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7fsvn64967"

RPM_NAME = "texlive-tikz-timing-2023.209.0.0.7fsvn64967-53.1.noarch.rpm"
RPM_HASH = "46b8ac63c84e96e0613aba261a1c466cfe361970e42e8bb1926c16177a4d022d7d481447d64c967fed2b0a55174eaf0a4f78a28beb3eca64a22cfebe718a3778"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-timing-advnodes.sty \
tex-tikz-timing-arrows.sty \
tex-tikz-timing-beamer.sty \
tex-tikz-timing-clockarrows.sty \
tex-tikz-timing-columntype.sty \
tex-tikz-timing-counters.sty \
tex-tikz-timing-either.sty \
tex-tikz-timing-ifsym.sty \
tex-tikz-timing-interval.sty \
tex-tikz-timing-nicetabs.sty \
tex-tikz-timing-overlays.sty \
tex-tikz-timing.sty \
texlive-tikz-timing"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-array.sty \
tex-booktabs.sty \
tex-environ.sty \
tex-pgfopts.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-svn-prov"

inherit rpm
