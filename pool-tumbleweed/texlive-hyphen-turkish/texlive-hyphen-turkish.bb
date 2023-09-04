SUMMARY = "Turkish hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Turkish in T1/EC and UTF-8 encodings. \
Auto-generated from a script included in the distribution. The \
patterns for Turkish were first produced for the Ottoman Texts \
Project in 1987 and were suitable for both Modern Turkish and \
Ottoman Turkish in Latin script, however the required character \
set didn't fit into EC encoding, so support for Ottoman Turkish \
had to be dropped to keep compatibility with 8-bit engines."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-turkish-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "ddf24a8a9492f6d3993e2f429c3c5dd591cc1b4a5a2a6d2985e53c1aa8bbdef58510cee28a7b9dca4e610ce7f012da076714163ba9a3891683ce517ce674befa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-tr.ec.tex \
tex-hyph-tr.tex \
tex-loadhyph-tr.tex \
texlive-hyphen-turkish"

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
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
