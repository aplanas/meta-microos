SUMMARY = "A manual about bibliographies and especially BibTeX"
DESCRIPTION = "An (as-complete-as-possible) manual about bibliographies in \
LaTeX, and thus mainly about BibTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn15878"

RPM_NAME = "texlive-tamethebeast-2023.201.1.4svn15878-54.1.noarch.rpm"
RPM_HASH = "b62cdcb0ef3e7cefb16b346e161f0a9b6933eacdf22775fc223fda3e5277e80cf082d3deadb145e422d501ba4802bec647f276b7ea9205dba517cc0b1cfc5d00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tamethebeast"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
