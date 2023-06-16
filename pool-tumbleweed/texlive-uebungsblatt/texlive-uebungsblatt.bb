SUMMARY = "A LaTeX class for writing exercise sheets"
DESCRIPTION = "This package implements a LaTeX class for writing exercise \
sheets for a lecture. Features: - quick typesetting of exercise \
sheets or their revisions, - simple user friendly commands, - \
elegant page formatting, - automatic numbering of exercises and \
sub-exercises, - the number of the exercise sheet is extracted \
automatically from the file name, - static information about \
the lectures and the authors needs to provided at one point \
only."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5.0svn15878"

RPM_NAME = "texlive-uebungsblatt-2023.201.1.5.0svn15878-53.1.noarch.rpm"
RPM_HASH = "072c09ff063290b3b07aa49253e5eb02becd70c691767234d25fa54043781c4b90d45b98a10fbbf6f20319e6ef1fef41506edca976d94ae184108188a1fc74ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uebungsblatt.cls \
tex-uebungsblatt.sty \
texlive-uebungsblatt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-akkcounterlabelpattern.sty \
tex-akkgerman.sty \
tex-akktecdoc.cls \
tex-amsmath.sty \
tex-fancyhdr.sty \
tex-ifthen.sty \
tex-inputenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
