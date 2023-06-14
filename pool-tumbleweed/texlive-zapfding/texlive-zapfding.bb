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

RPM_NAME = "texlive-zapfding-2023.201.svn61719-52.1.noarch.rpm"
RPM_HASH = "932f8ef68f1c5d5cf55e2614beb1d9286a68757ff43f0ed3cfd64fb7729e2f028b4d0eee41366d93296c5f83c8dba6e4d7d6aee7cb955a253b7deaa6f7293477"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pzdr.tfm \
tex-uuzd.fd \
tex-uzd.map \
tex-uzdr.tfm \
texlive-zapfding"

RDEPENDS:${PN} += "/bin/sh \
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
