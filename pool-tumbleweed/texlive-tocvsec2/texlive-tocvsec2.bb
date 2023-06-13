SUMMARY = "Section numbering and table of contents control"
DESCRIPTION = "Provides control over section numbering (without recourse to \
starred sectional commands) and/or the entries in the Table of \
Contents on a section by section basis."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3asvn33146"

RPM_NAME = "texlive-tocvsec2-2023.201.1.3asvn33146-52.1.noarch.rpm"
RPM_HASH = "b76823a07a31ee1d067264e7c6383e518ad8019ef2c96710bd1782e46fdfe6392c877abac0ecf6d64e9a904721615fbeebf09412cde24a60fb5f03281522c988"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tocvsec2.sty) \
texlive-tocvsec2"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
