SUMMARY = "Support for color in XeLaTeX"
DESCRIPTION = "This is a simple package which defines about 140 different \
colours using XeTeX's colour feature. The colours can be used \
in bidirectional texts without any problem."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn29660"

RPM_NAME = "texlive-xecolor-2023.201.0.0.1svn29660-52.2.noarch.rpm"
RPM_HASH = "1ab92cb49d9c486df1c0d675eb7805a09a2e1a9a6fb3d82829d7b25ac3c4569ff3a73a5bc82ea4d2d98f400943ebef43afd80eae593a90049d453793254ac9d3"
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
