SUMMARY = "Greek fonts by Yannis Haralambous"
DESCRIPTION = "A family of 7-bit fonts with a code table designed for setting \
modern polytonic Greek. The fonts are provided as Metafont \
source; macros to produce a Greek variant of Plain TeX \
(including a hyphenation table adapted to the fonts' code \
table) are provided."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn22613"

RPM_NAME = "texlive-yannisgr-2023.209.svn22613-53.1.noarch.rpm"
RPM_HASH = "895d0441b196a45531da76ddb37a69182ac9a4efcc745da459f63a0a0a4f97cbf6ef2fb283c00c2ef90ac02e9c6bc244cb487d54b143ef0ca99733b24ccc61ce"
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
