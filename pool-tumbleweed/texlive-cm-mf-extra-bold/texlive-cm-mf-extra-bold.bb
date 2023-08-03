SUMMARY = "Extra Metafont files for CM"
DESCRIPTION = "The bundle provides bold versions of cmcsc, cmex, cmtex and \
cmtt fonts (all parts of the standard computer modern font \
distribution), as Metafont base files."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn54512"

RPM_NAME = "texlive-cm-mf-extra-bold-2023.209.svn54512-54.1.noarch.rpm"
RPM_HASH = "2832d61ed8e5366bd64c2f1962ca9c1a350691d593e25c8e09468ec8faee2c54f460e8196185e1214df7e4f816ae4e5f20a6de6fdad7ba8be68a545059af6d70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmbcsc10.tfm \
tex-cmbtex10.tfm \
tex-cmbtt10.tfm \
tex-cmbtt8.tfm \
tex-cmbtt9.tfm \
tex-cmttb10.tfm \
texlive-cm-mf-extra-bold"

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
