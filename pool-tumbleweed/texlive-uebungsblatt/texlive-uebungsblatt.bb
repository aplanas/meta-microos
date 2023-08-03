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

PV = "2023.209.1.5.0svn15878"

RPM_NAME = "texlive-uebungsblatt-2023.209.1.5.0svn15878-54.1.noarch.rpm"
RPM_HASH = "6bf610cad0782e689c83b8debca0652571c229e387bfacf1dd6c969bf1d9403012f2f1a8acb0f59d58158829846a52e6fe35fd3ca93cc97c35137b6dd872fae2"
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
