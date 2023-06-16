SUMMARY = "A 'lipsum' package for the Kurdish language"
DESCRIPTION = "This package provides lipsum-like facilities for the Kurdish \
language. The package gives you easy access to the Kurdish \
poetry and balladry texts of the Diwany Vafaiy, Ahmedy Xani, \
Naly, Mahwy,.... The package needs to be run under XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn47518"

RPM_NAME = "texlive-kurdishlipsum-2023.201.1.1svn47518-55.1.noarch.rpm"
RPM_HASH = "575a36dec2de8717cacea4c46791b40282e196699faeecd016a86f51dd3d429ac5be15dae270bc0c10e274bdac9989c4790648946c91a2afefe29856d4aedefd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kurdishlipsum.sty \
texlive-kurdishlipsum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biditools.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
