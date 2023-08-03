SUMMARY = "TikZ libraries for filling with images and patterns"
DESCRIPTION = "This is a collection of TikZ libraries which add further \
options to fill TikZ paths with images and patterns. The \
libraries comprise fillings with images from files and from \
TikZ pictures. Also, patterns of hexagons and of rhombi are \
provided."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn63947"

RPM_NAME = "texlive-tikzfill-2023.209.1.0.0svn63947-53.1.noarch.rpm"
RPM_HASH = "9c9092c3ceaf548a6550747378295132b95f521f6d2a643e85979c1b3d949d41f4f3767acf69359e3f492afd88c8ec785cabe304106344ffa17d5989658d7723"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzfill-common.sty \
tex-tikzfill.hexagon.sty \
tex-tikzfill.image.sty \
tex-tikzfill.rhombus.sty \
tex-tikzfill.sty \
tex-tikzlibraryfill.hexagon.code.tex \
tex-tikzlibraryfill.image.code.tex \
tex-tikzlibraryfill.rhombus.code.tex \
texlive-tikzfill"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
