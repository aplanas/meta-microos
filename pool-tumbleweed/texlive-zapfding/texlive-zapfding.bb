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

RPM_NAME = "texlive-zapfding-2023.209.svn61719-53.2.noarch.rpm"
RPM_HASH = "c9522a1b58ea5e45361d375e0e01fac14e51621d18f13040187e8bb1b0edeac060cae46baf2f0d84b38e06d2b3e26e5202172eb801c718e14dc0b9220508bd93"
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
