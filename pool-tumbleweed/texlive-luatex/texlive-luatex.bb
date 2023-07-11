SUMMARY = "The LuaTeX engine"
DESCRIPTION = "LuaTeX is a greatly extended version of pdfTeX using Lua as an \
embedded scripting language. The LuaTeX project's main \
objective is to provide an open and configurable variant of TeX \
while at the same time offering substantive backward \
compatibility. LuaTeX uses Unicode (as UTF-8) as its default \
input encoding, and is able to use modern (OpenType and \
TrueType) fonts (for both text and mathematics)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.svn66546"

RPM_NAME = "texlive-luatex-2023.208.svn66546-53.1.noarch.rpm"
RPM_HASH = "537680fb9dd80c6154095b4a0cd2992ff61ca6b4d4462c973a6a53e7cf611a3850e00c399120a9f7d286593b278be08d0c2fd4e13707547943e0c0166b0e351e"
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
