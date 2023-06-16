SUMMARY = "Subliminal refinements towards typographical perfection"
DESCRIPTION = "The package provides a LaTeX interface to the micro-typographic \
extensions that were introduced by pdfTeX and have since also \
propagated to XeTeX and LuaTeX: most prominently, character \
protrusion and font expansion, furthermore the adjustment of \
interword spacing and additional kerning, as well as \
hyphenatable letterspacing (tracking) and the possibility to \
disable all or selected ligatures. These features may be \
applied to customisable sets of fonts, and all \
micro-typographic aspects of the fonts can be configured in a \
straight-forward and flexible way. Settings for various fonts \
are provided. Note that character protrusion requires pdfTeX, \
LuaTeX, or XeTeX. Font expansion works with pdfTeX or LuaTeX. \
The package will by default enable protrusion and expansion if \
they can safely be assumed to work. Disabling ligatures \
requires pdfTeX or LuaTeX, while the adjustment of interword \
spacing and of kerning only works with pdfTeX. Letterspacing is \
available with pdfTeX or LuaTeX. The alternative package \
'letterspace', which also works with plain TeX, provides the \
user commands for letterspacing only, omitting support for all \
other extensions."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1asvn66587"

RPM_NAME = "texlive-microtype-2023.201.3.1asvn66587-54.1.noarch.rpm"
RPM_HASH = "14fd4b32aaebf9cf48c362154a96e0957ffddb735788a03b1822944d9737350dbc94359788feb05f629ac3700a82057e3ef151aad2d9ad27695cd3d9246f0a76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-letterspace.sty \
tex-microtype-luatex.def \
tex-microtype-pdftex.def \
tex-microtype-show.sty \
tex-microtype-xetex.def \
tex-microtype.cfg \
tex-microtype.sty \
tex-mt-CharisSIL.cfg \
tex-mt-EBGaramond.cfg \
tex-mt-LatinModernRoman.cfg \
tex-mt-NewComputerModern.cfg \
tex-mt-Palatino.cfg \
tex-mt-TU-basic.cfg \
tex-mt-TU-empty.cfg \
tex-mt-bch.cfg \
tex-mt-blg.cfg \
tex-mt-cmr.cfg \
tex-mt-euf.cfg \
tex-mt-eur.cfg \
tex-mt-eus.cfg \
tex-mt-msa.cfg \
tex-mt-msb.cfg \
tex-mt-mvs.cfg \
tex-mt-pmn.cfg \
tex-mt-ppl.cfg \
tex-mt-ptm.cfg \
tex-mt-ugm.cfg \
tex-mt-zpeu.cfg \
texlive-microtype"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-iftex.sty \
tex-keyval.sty \
tex-luaotfload.sty \
tex-luatexbase.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
