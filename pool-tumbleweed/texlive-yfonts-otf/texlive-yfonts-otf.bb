SUMMARY = "OpenType version of the Old German fonts designed by Yannis Haralambous"
DESCRIPTION = "This is an OpenType version of the Old German fonts yfrak, \
ygoth, yswab designed by Yannis Haralambous in Metafont. The \
OpenType features make it easier to deal with the long/round s \
and with older forms of umlauts (small e over the letter). A \
style file yfonts-otf.sty is provided as a replacement, for \
LuaLaTeX and XeLaTeX, of yfonts.sty or oldgerm.sty."
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.43svn65030"

RPM_NAME = "texlive-yfonts-otf-2023.201.0.0.43svn65030-52.1.noarch.rpm"
RPM_HASH = "722aceaacc9849fcb8ed1d14afe51447b6076b0d790799c86a82989ec9074663a214545446729e3e09c9ae52c823ebf1124e75cf216002f5fcd7d3587d4a3548"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(oldgerm-otf.sty) \
tex(yfonts-otf.sty) \
texlive-yfonts-otf"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontspec.sty) \
tex(iftex.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-yfonts-otf-fonts"

inherit rpm
