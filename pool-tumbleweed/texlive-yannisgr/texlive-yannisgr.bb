SUMMARY = "Greek fonts by Yannis Haralambous"
DESCRIPTION = "A family of 7-bit fonts with a code table designed for setting \
modern polytonic Greek. The fonts are provided as Metafont \
source; macros to produce a Greek variant of Plain TeX \
(including a hyphenation table adapted to the fonts' code \
table) are provided."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn22613"

RPM_NAME = "texlive-yannisgr-2023.201.svn22613-52.2.noarch.rpm"
RPM_HASH = "aac6303e11154c13499cdeff9f451f3868d03c34f7d85766c157d08c7388447311188caa1fb36c72b3291bcf40ebc2502a6760a8acc6e657d0949ee0b07c5894"
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
