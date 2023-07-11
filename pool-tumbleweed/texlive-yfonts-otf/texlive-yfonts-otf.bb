SUMMARY = "OpenType version of the Old German fonts designed by Yannis Haralambous"
DESCRIPTION = "This is an OpenType version of the Old German fonts yfrak, \
ygoth, yswab designed by Yannis Haralambous in Metafont. The \
OpenType features make it easier to deal with the long/round s \
and with older forms of umlauts (small e over the letter). A \
style file yfonts-otf.sty is provided as a replacement, for \
LuaLaTeX and XeLaTeX, of yfonts.sty or oldgerm.sty."
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.43svn65030"

RPM_NAME = "texlive-yfonts-otf-2023.201.0.0.43svn65030-52.2.noarch.rpm"
RPM_HASH = "c67b02d933534d28b9f9372e60c0c0ebead87236c50cf340f9293bff5e8891ccb2c15c3f8b6373ca9bc43d4ede3adcdf860fc5335bd964db11a3f7c7067794e4"
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
