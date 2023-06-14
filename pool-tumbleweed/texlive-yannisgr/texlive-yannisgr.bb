SUMMARY = "Greek fonts by Yannis Haralambous"
DESCRIPTION = "A family of 7-bit fonts with a code table designed for setting \
modern polytonic Greek. The fonts are provided as Metafont \
source; macros to produce a Greek variant of Plain TeX \
(including a hyphenation table adapted to the fonts' code \
table) are provided."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn22613"

RPM_NAME = "texlive-yannisgr-2023.201.svn22613-52.1.noarch.rpm"
RPM_HASH = "ed3ddfafd1d151382941ab6cdb547cf4ad5fe29887a2aeb971995892c6b1a995081f5619ba67327fbd20ea1805ce0f9bf293504065eca86b577584355025bf68"
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

RDEPENDS:${PN} += "/bin/sh \
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
