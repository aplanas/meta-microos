SUMMARY = "OpenType version of the Old German fonts designed by Yannis Haralambous"
DESCRIPTION = "This is an OpenType version of the Old German fonts yfrak, \
ygoth, yswab designed by Yannis Haralambous in Metafont. The \
OpenType features make it easier to deal with the long/round s \
and with older forms of umlauts (small e over the letter). A \
style file yfonts-otf.sty is provided as a replacement, for \
LuaLaTeX and XeLaTeX, of yfonts.sty or oldgerm.sty."
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.43svn65030"

RPM_NAME = "texlive-yfonts-otf-2023.209.0.0.43svn65030-53.1.noarch.rpm"
RPM_HASH = "cea446b8228b6f59985dd21d27d966a997c88ccde52c9e11cc20210a6a3c5af0d2baaefd8829dbbd60634181db0611a954f2c21e5e958e2851a5818a244a2c73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-oldgerm-otf.sty \
tex-yfonts-otf.sty \
texlive-yfonts-otf"

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
texlive-scripts-bin \
texlive-yfonts-otf-fonts"

inherit rpm
