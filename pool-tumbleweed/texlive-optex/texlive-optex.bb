SUMMARY = "LuaTeX format based on Plain TeX and OPmac"
DESCRIPTION = "OpTeX is a LuaTeX format based on Plain TeX macros with power \
from OPmac (fonts selection system, colors, external graphics, \
references, hyperlinks, ...) with unicode fonts."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.11svn66513"

RPM_NAME = "texlive-optex-2023.209.1.11svn66513-55.1.noarch.rpm"
RPM_HASH = "b60b75b646181fa993df4e675273598e7681ed7d5bc30f6f507e5f986d70802bb95aad1608bf2f61ed52ef790fe27a1fca7f7507cf53d117e0c8f51ed0894663"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-op-demo.tex \
tex-op-letter-cs.tex \
tex-op-letter-en.tex \
tex-op-mathalign.tex \
tex-op-slides.tex \
texlive-optex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-amsfonts \
texlive-cm \
texlive-ec \
texlive-filesystem \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-librarian \
texlive-lm \
texlive-luaotfload \
texlive-luatex \
texlive-optex-bin \
texlive-rsfs \
texlive-scripts \
texlive-scripts-bin \
texlive-unicode-data"

inherit rpm
