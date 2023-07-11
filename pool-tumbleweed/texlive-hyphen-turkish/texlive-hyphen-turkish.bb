SUMMARY = "Turkish hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Turkish in T1/EC and UTF-8 encodings. \
Auto-generated from a script included in the distribution. The \
patterns for Turkish were first produced for the Ottoman Texts \
Project in 1987 and were suitable for both Modern Turkish and \
Ottoman Turkish in Latin script, however the required character \
set didn't fit into EC encoding, so support for Ottoman Turkish \
had to be dropped to keep compatibility with 8-bit engines."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-turkish-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "9a4c38915d0f3eabd6d2fa68608d56bd1a6afd1dbf9abf0e2aa39863fd34410c0d89fd9376b610e79b123d864c4b156f4faf418aa2436ac83ddc2dcdab9c9625"
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
