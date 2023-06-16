SUMMARY = "Produce chord information to go with pmx output"
DESCRIPTION = "The bundle supplements pmx, providing the means of typesetting \
chords above the notes of a score. The bundle contains: macros \
for typing the chords; a Lua script to transpose chord macros \
to the required key signature; and support scripts for common \
requirements."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.0.2svn39249"

RPM_NAME = "texlive-pmxchords-2023.201.2.0.2svn39249-52.1.noarch.rpm"
RPM_HASH = "b97431b89a312193a358b5661d3ff6eb5f0bdf66cbfae62211fc75470d664e24873bc7e6751f8e77463a405fea897f9b474fa90e0061f1493b081ad6430ba29c"
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
