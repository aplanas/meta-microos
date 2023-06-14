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

RPM_NAME = "texlive-symbol-2023.201.svn61719-57.1.noarch.rpm"
RPM_HASH = "0e3a7cc04b36adb4ae14e4e4efd1fd87870b2af35c3c242bf148f7f99458f27f67452965dfda553af8ec5dab5d436144e1e7f983f6edd7cd94ff336c57ec8220"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-msyr.tfm \
tex-psyr.tfm \
tex-usy.map \
tex-usyr.tfm \
tex-uusy.fd \
texlive-symbol"

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
texlive-symbol-fonts"

inherit rpm
