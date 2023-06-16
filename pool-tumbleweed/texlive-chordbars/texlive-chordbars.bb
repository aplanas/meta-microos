SUMMARY = "Print chord grids for pop/jazz tunes"
DESCRIPTION = "This Tikz-based music-related package is targeted at pop/jazz \
guitar/bass/piano musicians. They usually need only the chords \
and the song structure. This package produces rectangular song \
patterns with 'one square per bar', with the chord shown inside \
the square. It also handles the song structure by showing the \
bar count and the repetitions of the patterns."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn49569"

RPM_NAME = "texlive-chordbars-2023.201.1.1svn49569-53.1.noarch.rpm"
RPM_HASH = "e10177a2d6a741f4d9402492badac1c2574c903b372f38847f48eff3274b5c19b71d5243f6f889e4e043055bd063a160eff85e722b3d599697ffe0ea841a5e26"
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
