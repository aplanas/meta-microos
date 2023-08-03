SUMMARY = "A todo that snaps to the closer side"
DESCRIPTION = "This package is an alternative to todonotes, from which it \
differs in the following ways: Depending on where you call \
\\snaptodo, the note is put in the left or the right margin, \
whichever is closer. The notes bump each other so they never \
overlap; the lines never overlap either. Aesthetic and \
customizable style."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn61155"

RPM_NAME = "texlive-snaptodo-2023.209.svn61155-58.1.noarch.rpm"
RPM_HASH = "f424070846096019f79870ddf9e9b3845aa6239ba5abc77e2a3cff945c99244cd80baad5a9bf12eb76348d23e72dd9d9cfde1b3cea46de92a63953e00e43da7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-snaptodo.sty \
texlive-snaptodo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikzpagenodes.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
