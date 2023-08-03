SUMMARY = "Produce chord information to go with pmx output"
DESCRIPTION = "The bundle supplements pmx, providing the means of typesetting \
chords above the notes of a score. The bundle contains: macros \
for typing the chords; a Lua script to transpose chord macros \
to the required key signature; and support scripts for common \
requirements."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.0.2svn39249"

RPM_NAME = "texlive-pmxchords-2023.209.2.0.2svn39249-53.1.noarch.rpm"
RPM_HASH = "8294f514958e8dcb3b9b7c4206671d19919f437801c7b1dc73f81261cca45ad31061d16df85b7c5d928bf10bb1e1c8fa9f4bdd1860ba6273a1ca2cc421f6c74a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chords.tex \
tex-chordsCZ.tex \
texlive-pmxchords"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pmxchords-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
