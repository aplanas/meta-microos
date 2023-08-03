SUMMARY = "Fonts to typeset with the xgreek package"
DESCRIPTION = "The UMTypewriter font family is a monospaced font family that \
was built from glyphs from the CB Greek fonts, the CyrTUG \
Cyrillic alphabet fonts ('LH'), and the standard Computer \
Modern font family. It contains four OpenType fonts which are \
required for use of the xgreek package for XeLaTeX."
LICENSE = "OFL-1.1"

PV = "2023.209.1.1svn64443"

RPM_NAME = "texlive-umtypewriter-2023.209.1.1svn64443-54.1.noarch.rpm"
RPM_HASH = "e0669c2ac6eab3c41d324ca403ac5ca17c910be12f1ed090a07ece01116711a62436a59ea0109f0848dfad15343ba549876b786fcf7b7f869b9c0d731bc94dbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-umtypewriter"

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
texlive-scripts-bin \
texlive-umtypewriter-fonts"

inherit rpm
