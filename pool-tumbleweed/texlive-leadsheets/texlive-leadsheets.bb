SUMMARY = "Typesetting leadsheets and songbooks"
DESCRIPTION = "This LaTeX package offers support for typesetting simple \
leadsheets of songs, i.e. song lyrics and the corresponding \
chords."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn61504"

RPM_NAME = "texlive-leadsheets-2023.209.0.0.7svn61504-55.1.noarch.rpm"
RPM_HASH = "3381bd62c14fefa2d1fbb0ab262fb05a71de6020e7220d87167de49c44732e14c8100f84cb3a57ddf35d5a7f88bbad1ceea14727acdb8ec5e41472f0565499bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-leadsheet.cls \
tex-leadsheets.library.chordnames.code.tex \
tex-leadsheets.library.chords.code.tex \
tex-leadsheets.library.external.code.tex \
tex-leadsheets.library.musejazz.code.tex \
tex-leadsheets.library.musicsymbols.code.tex \
tex-leadsheets.library.properties.code.tex \
tex-leadsheets.library.shorthands.code.tex \
tex-leadsheets.library.songs.code.tex \
tex-leadsheets.library.templates.code.tex \
tex-leadsheets.library.translations.code.tex \
tex-leadsheets.library.transposing.code.tex \
tex-leadsheets.sty \
texlive-leadsheets"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-scrlayer-scrpage.sty \
tex-translations.sty \
tex-xparse.sty \
tex-zref-totpages.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
