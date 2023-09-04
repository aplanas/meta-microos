SUMMARY = "Engraving Gregorian Chant scores"
DESCRIPTION = "Gregorio is a software application for engraving Gregorian \
Chant scores on a computer. Gregorio's main job is to convert a \
gabc file (simple text representation of a score) into a \
GregorioTeX file, which makes TeX able to create a PDF of your \
score."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.6.0.0svn58331"

RPM_NAME = "texlive-gregoriotex-2023.209.6.0.0svn58331-54.2.noarch.rpm"
RPM_HASH = "8b3bb69d1311544a78edea857fe076510c85834243567c66356d17699798de2553c295f94244d2d3563509498b234cd92abb281bd6d842ce3eb41b0081775e49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gregorio-vowels.dat \
tex-gregoriosyms.sty \
tex-gregoriotex-chars.tex \
tex-gregoriotex-common.tex \
tex-gregoriotex-gsp-default.tex \
tex-gregoriotex-main.tex \
tex-gregoriotex-nabc.tex \
tex-gregoriotex-signs.tex \
tex-gregoriotex-spaces.tex \
tex-gregoriotex-syllable.tex \
tex-gregoriotex-symbols.tex \
tex-gregoriotex.sty \
tex-gregoriotex.tex \
texlive-gregoriotex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-iftex.sty \
tex-kvoptions.sty \
tex-luacolor.sty \
tex-luamplib.sty \
tex-luaotfload.sty \
tex-luatexbase.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-gregoriotex-bin \
texlive-gregoriotex-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
