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

PV = "2023.208.svn61719"

RPM_NAME = "texlive-hyph-utf8-2023.208.svn61719-53.1.noarch.rpm"
RPM_HASH = "3c18f4a7153dcf38c9d3c1b8d326808651e55d120dd40df4e938e1b09b392fab1cb4dc1c121dbad5f6de756cf321bd458a6f510f8c1eecfbd114be121d8146e9"
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
