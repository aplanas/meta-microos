SUMMARY = "LuaTeX format based on Plain TeX and OPmac"
DESCRIPTION = "OpTeX is a LuaTeX format based on Plain TeX macros with power \
from OPmac (fonts selection system, colors, external graphics, \
references, hyperlinks, ...) with unicode fonts."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.11svn66513"

RPM_NAME = "texlive-optex-2023.201.1.11svn66513-54.1.noarch.rpm"
RPM_HASH = "532ebf7997af13ca81f3623303fd02e9ad6d8b02d2b97eee54e41ede2a550e17c768dd1d4c3223d549def55a97dc604c5698b700d4e626ab81b7a3211a54f68b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-op-demo.tex \
tex-op-letter-cs.tex \
tex-op-letter-en.tex \
tex-op-mathalign.tex \
tex-op-slides.tex \
texlive-optex"

RDEPENDS:${PN} += "/bin/sh \
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
