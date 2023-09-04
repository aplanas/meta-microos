SUMMARY = "Hyphenation patterns expressed in UTF-8"
DESCRIPTION = "Modern native UTF-8 engines such as XeTeX and LuaTeX need \
hyphenation patterns in UTF-8 format, whereas older systems \
require hyphenation patterns in the 8-bit encoding of the font \
in use (such encodings are codified in the LaTeX scheme with \
names like OT1, T2A, TS1, OML, LY1, etc). The present package \
offers a collection of conversions of existing patterns to \
UTF-8 format, together with converters for use with 8-bit fonts \
in older systems. Since hyphenation patterns for Knuthian-style \
TeX systems are only read at iniTeX time, it is hoped that the \
UTF-8 patterns, with their converters, will completely supplant \
the older patterns."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn61719"

RPM_NAME = "texlive-hyph-utf8-2023.209.svn61719-54.1.noarch.rpm"
RPM_HASH = "0cf2d7a517d51b978cba3490cfe0e41376adc5776d0a83359c81bfe8a89bc59b73734975e300e62d5c8758d0d77a5f2a4ef220337a5b7b537f22577368aa0780"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-conv-utf8-ec.tex \
tex-conv-utf8-il2.tex \
tex-conv-utf8-il3.tex \
tex-conv-utf8-l7x.tex \
tex-conv-utf8-lmc.tex \
tex-conv-utf8-lth.tex \
tex-conv-utf8-qx.tex \
tex-conv-utf8-t2a.tex \
tex-conv-utf8-t8m.tex \
texlive-hyph-utf8"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
