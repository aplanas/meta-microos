SUMMARY = "A font with the images of the countries of Europe"
DESCRIPTION = "The bundle provides a font 'CountriesOfEurope' (in Adobe Type 1 \
format) and the necessary metrics, together with LaTeX macros \
for its use. The font provides glyphs with a filled outline of \
the shape of each country; each glyph is at the same \
cartographic scale."
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.23svn54512"

RPM_NAME = "texlive-countriesofeurope-2023.209.0.0.23svn54512-55.1.noarch.rpm"
RPM_HASH = "90406fe58ba1cd5ccebbda8d1bc9dfbf93ecb9ac373824152f5108bed6ccf0994bf1854a602486dd076abb8c6ad8da1effc5e195da2d891913a4517ee464a780"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-countriesofeurope.enc \
tex-countriesofeurope.map \
tex-countriesofeurope.sty \
tex-countriesofeurope.tfm \
texlive-countriesofeurope"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-textcomp.sty \
tex-updmap.cfg \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-countriesofeurope-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
