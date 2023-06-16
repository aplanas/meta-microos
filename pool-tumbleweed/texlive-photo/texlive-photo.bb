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

PV = "2023.201.svn18739"

RPM_NAME = "texlive-photo-2023.201.svn18739-51.1.noarch.rpm"
RPM_HASH = "392672f893bcf958cf88035523188b00545bd3e1e491dca5e2ada78eda457dc15df43b6731da2154b83803f7174fecb274583ced26440fc370ec4c61e5cbfcaf"
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
