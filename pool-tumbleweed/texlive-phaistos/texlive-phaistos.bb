SUMMARY = "Disk of Phaistos font"
DESCRIPTION = "A font that contains all the symbols of the famous Disc of \
Phaistos, together with a LaTeX package. The disc was 'printed' \
by stamping the wet clay with some sort of punches, probably \
around 1700 BCE. The font is available in Adobe Type 1 and \
OpenType formats (the latter using the Unicode positions for \
the symbols). There are those who believe that this Cretan \
script was used to 'write' Greek (it is known, for example, \
that the rather later Cretan Linear B script was used to write \
Greek), but arguments for other languages have been presented."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn18651"

RPM_NAME = "texlive-phaistos-2023.209.1.0svn18651-52.1.noarch.rpm"
RPM_HASH = "7f643e22ec45b0180377c1930462886f56be52d799cff3eb2254b58f83f90a18412b0c0e5d76d195fb4fd0b53730a013ef71a96692c37ec8f1406ea9abbc1013"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phaistos.map \
tex-phaistos.sty \
tex-phaistos.tfm \
texlive-phaistos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-phaistos-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
