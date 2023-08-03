SUMMARY = "Support for color in XeLaTeX"
DESCRIPTION = "This is a simple package which defines about 140 different \
colours using XeTeX's colour feature. The colours can be used \
in bidirectional texts without any problem."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn29660"

RPM_NAME = "texlive-xecolor-2023.209.0.0.1svn29660-53.1.noarch.rpm"
RPM_HASH = "faa31540e3249c9c816f23d0950b90fca2d81e947a58c3ebaa1d14ddbb0c9b40b4ae6023f57bf54ee62772d5ffedf6371dcbd0154acbf08b27b38808cc45a942"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xecolor.sty \
texlive-xecolor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
