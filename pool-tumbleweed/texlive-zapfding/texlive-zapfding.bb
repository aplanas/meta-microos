SUMMARY = "URW 'Base 35' font pack for LaTeX"
DESCRIPTION = "A set of fonts for use as 'drop-in' replacements for Adobe's \
basic set, comprising: Century Schoolbook (substituting for \
Adobe's New Century Schoolbook); Dingbats (substituting for \
Adobe's Zapf Dingbats); Nimbus Mono L (substituting for Abobe's \
Courier); Nimbus Roman No9 L (substituting for Adobe's Times); \
Nimbus Sans L (substituting for Adobe's Helvetica); Standard \
Symbols L (substituting for Adobe's Symbol); URW Bookman; URW \
Chancery L Medium Italic (substituting for Adobe's Zapf \
Chancery); URW Gothic L Book (substituting for Adobe's Avant \
Garde); and URW Palladio L (substituting for Adobe's Palatino)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn61719"

RPM_NAME = "texlive-zapfding-2023.209.svn61719-53.1.noarch.rpm"
RPM_HASH = "48a23c2abe414ebdfe1743ccd0b3dd4415a1f79c39b6ff96bc0bb152afbee06a423d9e461a911df833dd4295cdb6482d984419a454537ade3d00f91462ece08a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pzdr.tfm \
tex-uuzd.fd \
tex-uzd.map \
tex-uzdr.tfm \
texlive-zapfding"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-zapfding-fonts"

inherit rpm
