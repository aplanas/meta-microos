SUMMARY = "Draw braid diagrams with PGF/TikZ"
DESCRIPTION = "The package enables drawing of braid diagrams with PGF/TikZ \
using a simple syntax. The braid itself is specified by giving \
a word in the braid group, and there are many options for \
styling the strands and for drawing 'floors'."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn64817"

RPM_NAME = "texlive-braids-2023.209.2.2svn64817-53.1.noarch.rpm"
RPM_HASH = "9ccdd3162bd5106450d7154ef20a8939829a9ca07036c0e035ff6938114c49044de9ade0445729a9d47a0729c51d38c4a6ae794341c60a593d4514a9f17e4947"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-braids.sty \
tex-tikzlibrarybraids.code.tex \
texlive-braids"

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
