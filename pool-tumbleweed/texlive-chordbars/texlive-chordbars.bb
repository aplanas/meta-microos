SUMMARY = "Print chord grids for pop/jazz tunes"
DESCRIPTION = "This Tikz-based music-related package is targeted at pop/jazz \
guitar/bass/piano musicians. They usually need only the chords \
and the song structure. This package produces rectangular song \
patterns with 'one square per bar', with the chord shown inside \
the square. It also handles the song structure by showing the \
bar count and the repetitions of the patterns."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn49569"

RPM_NAME = "texlive-chordbars-2023.209.1.1svn49569-54.1.noarch.rpm"
RPM_HASH = "e2f554831ecfcdc9a8d45a4adf851c5e4fb13ce059ce7d89ac233634128678d21f12397ab1b001c72bf0a6ec744ad4b5fefe19d328c885acf542b688bfb414aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chordbars.sty \
texlive-chordbars"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-pgfmath.sty \
tex-tikz.sty \
tex-tkz-euclide.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
