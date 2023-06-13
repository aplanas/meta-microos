SUMMARY = "A LaTeX based calendar using TikZ"
DESCRIPTION = "For usage see the example files tikz-kalender-example1.tex, \
tikz-kalender-example2.tex, and *.events. The Code is inspired \
by this document and is subject to the >>Creative Commons \
attribution license (CC-BY-SA)<<. The class tikz-kalender \
requires the package TikZ and the TikZ libraries calc and \
calendar."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4fsvn52890"

RPM_NAME = "texlive-tikz-kalender-2023.201.0.0.4fsvn52890-52.1.noarch.rpm"
RPM_HASH = "c4741e0266b99fb180e799d3fc42c5a5038257d4ce3ae9b6ecf979c33d5652ef8e5a523be26feba229fbef09320c10b7698ab9c8582d7eec6a87a80630e928cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikz-kalender-translation.clo) \
tex(tikz-kalender.cls) \
texlive-tikz-kalender"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(article.cls) \
tex(babel.sty) \
tex(etoolbox.sty) \
tex(fontenc.sty) \
tex(fontspec.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(ifluatex.sty) \
tex(ifxetex.sty) \
tex(inputenc.sty) \
tex(lmodern.sty) \
tex(pgfkeys.sty) \
tex(ragged2e.sty) \
tex(textcomp.sty) \
tex(tgheros.sty) \
tex(tikz.sty) \
tex(translator.sty) \
tex(unicode-math.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
