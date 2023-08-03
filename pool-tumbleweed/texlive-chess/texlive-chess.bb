SUMMARY = "Fonts for typesetting chess boards"
DESCRIPTION = "The original (and now somewhat dated) TeX chess font package. \
Potential users should consider skak (for alternative fonts, \
and notation support), texmate (for alternative notation \
support), or chessfss (for flexible font choices)."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.2svn20582"

RPM_NAME = "texlive-chess-2023.209.1.2svn20582-54.1.noarch.rpm"
RPM_HASH = "f1fe02ff59ee10bd9e7f32405a7dcc1d0d50c11f686569da60dcf0dc038d09214171808c2efc58c1fe5e87e50cf9ceb4a346fd6b702d08e7573ed5e1751e684c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chess.sty \
tex-chess10.tfm \
tex-chess20.tfm \
tex-chess30.tfm \
tex-chessf10.tfm \
tex-chessfig10.tfm \
texlive-chess"

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
