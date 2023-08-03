SUMMARY = "Tables of relative positions of curves and asymptotes or tangents in Arabic documents"
DESCRIPTION = "This package facilitates, in most cases, the creation of tables \
of relative positions of a curve and its asymptote, or a curve \
and a tangent in one of its points. It depends on tkz-tab and \
listofitems, as well as amsmath, amsfonts, mathrsfs, and \
amssymb. This package has to be used with polyglossia and \
XeLaTeX to produce documents in Arabic."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn55559"

RPM_NAME = "texlive-na-position-2023.209.1.2svn55559-55.1.noarch.rpm"
RPM_HASH = "3a6659c176003de9551e6c55aef11bc91467b7e0583985617fb306458d8e1e4f6faa8318f655d94b0eb50f2a9b07003c2abf2f19a36c7109211d2a1de233e2b8"
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
