SUMMARY = "OpenType version of the Old German fonts designed by Yannis Haralambous"
DESCRIPTION = "This is an OpenType version of the Old German fonts yfrak, \
ygoth, yswab designed by Yannis Haralambous in Metafont. The \
OpenType features make it easier to deal with the long/round s \
and with older forms of umlauts (small e over the letter). A \
style file yfonts-otf.sty is provided as a replacement, for \
LuaLaTeX and XeLaTeX, of yfonts.sty or oldgerm.sty."
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.43svn65030"

RPM_NAME = "texlive-yfonts-otf-2023.209.0.0.43svn65030-53.2.noarch.rpm"
RPM_HASH = "efec49494634ec68e2098b098ce7e3d9d441d82c4eca6c5c3f8e06812ad0491a61f594f6f7bc1a0983949ea21f482a4ff92d723e5efed27903bf302853c0a229"
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
