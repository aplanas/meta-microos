SUMMARY = "Tables of relative positions of curves and asymptotes or tangents in Arabic documents"
DESCRIPTION = "This package facilitates, in most cases, the creation of tables \
of relative positions of a curve and its asymptote, or a curve \
and a tangent in one of its points. It depends on tkz-tab and \
listofitems, as well as amsmath, amsfonts, mathrsfs, and \
amssymb. This package has to be used with polyglossia and \
XeLaTeX to produce documents in Arabic."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn55559"

RPM_NAME = "texlive-na-position-2023.201.1.2svn55559-54.1.noarch.rpm"
RPM_HASH = "7d1379967ae935514ba08ed70fe36d9356d82155bfb8bf5effafb3863d3f010e3813d2ef410fba3145fae3563c29e7dbb44a56b33f935d1ad133618e2c2442bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-na-position.sty \
texlive-na-position"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tkz-tab.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
