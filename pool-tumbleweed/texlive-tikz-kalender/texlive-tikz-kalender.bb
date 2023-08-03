SUMMARY = "A LaTeX based calendar using TikZ"
DESCRIPTION = "For usage see the example files tikz-kalender-example1.tex, \
tikz-kalender-example2.tex, and *.events. The Code is inspired \
by this document and is subject to the >>Creative Commons \
attribution license (CC-BY-SA)<<. The class tikz-kalender \
requires the package TikZ and the TikZ libraries calc and \
calendar."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4fsvn52890"

RPM_NAME = "texlive-tikz-kalender-2023.209.0.0.4fsvn52890-53.1.noarch.rpm"
RPM_HASH = "d1c581c1f3ed2f38d3d8d724edd493594f87b445725d5bede9739319462a875ab029a74c07c4cfac8c8f82cc509787b3018031694aef6d6e2adae0d081de166b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-kalender-translation.clo \
tex-tikz-kalender.cls \
texlive-tikz-kalender"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-babel.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-lmodern.sty \
tex-pgfkeys.sty \
tex-ragged2e.sty \
tex-textcomp.sty \
tex-tgheros.sty \
tex-tikz.sty \
tex-translator.sty \
tex-unicode-math.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
