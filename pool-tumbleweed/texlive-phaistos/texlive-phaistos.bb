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

PV = "2023.201.1.0svn18651"

RPM_NAME = "texlive-phaistos-2023.201.1.0svn18651-51.1.noarch.rpm"
RPM_HASH = "88bcc305dca79a5697e77e8354e0aa5d5f48c130c7aad3b650aee0b5029ac04403a59b6b572e220cf7fd8585c24199fb45970aa3f6f91f4dee798fbc9bbc9f1b"
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
