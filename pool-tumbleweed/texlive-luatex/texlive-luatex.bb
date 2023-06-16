SUMMARY = "The LuaTeX engine"
DESCRIPTION = "LuaTeX is a greatly extended version of pdfTeX using Lua as an \
embedded scripting language. The LuaTeX project's main \
objective is to provide an open and configurable variant of TeX \
while at the same time offering substantive backward \
compatibility. LuaTeX uses Unicode (as UTF-8) as its default \
input encoding, and is able to use modern (OpenType and \
TrueType) fonts (for both text and mathematics)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn66546"

RPM_NAME = "texlive-luatex-2023.201.svn66546-52.1.noarch.rpm"
RPM_HASH = "7b27e65e68198ffcb4531851c8a4fdd6e7db162ee7508a4fc38b1b6dc93271a9692de6fa34d869661495fe7c66cde88b004937a7cf8a14d653d0b88157ce2583"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-luatex \
tex-luatex-unicode-letters.tex \
tex-luatexiniconfig.tex \
texlive-luatex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
tex-load-unicode-data.tex \
tex-luatexconfig.tex \
tex-null.tex \
texlive \
texlive-cm \
texlive-etex \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-luatex-bin \
texlive-manfnt \
texlive-plain \
texlive-scripts \
texlive-scripts-bin \
texlive-tex-ini-files \
texlive-unicode-data"

inherit rpm
