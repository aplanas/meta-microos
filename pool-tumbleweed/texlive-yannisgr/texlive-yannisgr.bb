SUMMARY = "Greek fonts by Yannis Haralambous"
DESCRIPTION = "A family of 7-bit fonts with a code table designed for setting \
modern polytonic Greek. The fonts are provided as Metafont \
source; macros to produce a Greek variant of Plain TeX \
(including a hyphenation table adapted to the fonts' code \
table) are provided."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn22613"

RPM_NAME = "texlive-yannisgr-2023.209.svn22613-53.2.noarch.rpm"
RPM_HASH = "0962d1868df40d37763f9e49816d5153b82326a7e26e29317af9ea487aef2b1662951ef84d8b9dff40cdad7dc3e885674afcb456fc8670f9b9a325f68be56349"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mrgrbf10.tfm \
tex-mrgrrg10.tfm \
tex-mrgrsl10.tfm \
tex-mrgrti10.tfm \
tex-rgrbf10.tfm \
tex-rgrrg10.tfm \
tex-rgrsc10.tfm \
tex-rgrsl10.tfm \
tex-rgrti10.tfm \
texlive-yannisgr"

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
