SUMMARY = "Music packages"
DESCRIPTION = "Music-related fonts and packages."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn65862"

RPM_NAME = "texlive-collection-music-2023.208.svn65862-60.1.noarch.rpm"
RPM_HASH = "200187faf3716467fc2c27f6d5367d5533865b8b9de0414e2742e848accc6ca2c22f6c88ca94b935dc40cd2eeae15ad27e4bb66ee08d9537d5fbaf00326ecfa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-music \
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
