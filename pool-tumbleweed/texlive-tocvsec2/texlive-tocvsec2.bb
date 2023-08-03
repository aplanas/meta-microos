SUMMARY = "Section numbering and table of contents control"
DESCRIPTION = "Provides control over section numbering (without recourse to \
starred sectional commands) and/or the entries in the Table of \
Contents on a section by section basis."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3asvn33146"

RPM_NAME = "texlive-tocvsec2-2023.209.1.3asvn33146-53.1.noarch.rpm"
RPM_HASH = "e71cff6b74ad43a17cacbcc1aeba9b6d4bde460291d305e624690b1baf63a5cba314d9c3567b77d7ba31e15910a03a860c4241fd99dcb28ddaecaeba4b434b5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tocvsec2.sty \
texlive-tocvsec2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
