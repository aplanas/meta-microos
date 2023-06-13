SUMMARY = "Music packages"
DESCRIPTION = "Music-related fonts and packages."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn65862"

RPM_NAME = "texlive-collection-music-2023.208.svn65862-58.1.noarch.rpm"
RPM_HASH = "b925ffe7f6df7e1732caaec853903aa8287c276531604cf3287450bd3ebfa35cb2045a04b8c24d43f02e3b05d41f2d44e65e9b7a27c250bfa3fd74798dc3e401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(music) \
texlive-collection-music"

RDEPENDS:${PN} += "texlive-abc \
texlive-autosp \
texlive-bagpipe \
texlive-chordbars \
texlive-chordbox \
texlive-collection-latex \
texlive-ddphonism \
texlive-figbas \
texlive-gchords \
texlive-gregoriotex \
texlive-gtrcrd \
texlive-guitar \
texlive-guitarchordschemes \
texlive-guitartabs \
texlive-harmony \
texlive-latex4musicians \
texlive-leadsheets \
texlive-lilyglyphs \
texlive-lyluatex \
texlive-m-tx \
texlive-musical \
texlive-musicography \
texlive-musixguit \
texlive-musixtex \
texlive-musixtex-fonts \
texlive-musixtnt \
texlive-octave \
texlive-piano \
texlive-pmx \
texlive-pmxchords \
texlive-recorder-fingering \
texlive-songbook \
texlive-songproj \
texlive-songs \
texlive-xml2pmx \
texlive-xpiano"

inherit rpm
