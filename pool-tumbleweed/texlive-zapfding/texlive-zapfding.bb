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

PV = "2023.201.svn61719"

RPM_NAME = "texlive-zapfding-2023.201.svn61719-52.2.noarch.rpm"
RPM_HASH = "d818bd396f30b3fd2d693ae4126bdb9d40ae7a9fb4f9b609656942b9b457861bc7acc55fda0dde5c33a62687e92e719f2eacd2be0a92f3a6e2e6d593af0c96b8"
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
