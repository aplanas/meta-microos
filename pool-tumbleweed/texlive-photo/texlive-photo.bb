SUMMARY = "A float environment for photographs"
DESCRIPTION = "This package introduces a new float type called photo which \
works similar to the float types table and figure. Various \
options exist for placing photos, captions, and a \
'photographer' line. In twocolumn documents, a possibility \
exists to generate double-column floats automatically if the \
photo does not fit into one column. Photos do not have to be \
placed as floats, they can also be placed as boxes, with \
captions and photographer line still being available."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn18739"

RPM_NAME = "texlive-photo-2023.209.svn18739-52.1.noarch.rpm"
RPM_HASH = "227ae5a06cb98710083a6aeb446fd8dca298464a3997925b308cb32c10be8c9e36e1f980ce6fe02feacdecab9e25d17897c453a180fb2829bf6c97758ca3c807"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-photo.sty \
texlive-photo"

RDEPENDS:${PN} += "/usr/bin/sh \
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
