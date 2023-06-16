SUMMARY = "Draw braid diagrams with PGF/TikZ"
DESCRIPTION = "The package enables drawing of braid diagrams with PGF/TikZ \
using a simple syntax. The braid itself is specified by giving \
a word in the braid group, and there are many options for \
styling the strands and for drawing 'floors'."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn64817"

RPM_NAME = "texlive-braids-2023.201.2.2svn64817-52.1.noarch.rpm"
RPM_HASH = "c1178eb1a789f01761fa6be3712a45c949d59ee3b585d05d81c3f8d0a9516e5334713aa39d2f2f6ec8cca794eb5315deaed267876cbb87b0071ff3c8ee771405"
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
