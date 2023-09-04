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

RPM_NAME = "texlive-zapfchan-2023.209.svn61719-53.2.noarch.rpm"
RPM_HASH = "3455a6cbc826282776de026ea3491e9b66ca96cdf35dad80807668fbd7f65b6543eb0fa7dd8973bdb9fe406133c9e6277640d21cf9b42c5c560135611fa7ff2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-8ruzc.fd \
tex-omluzc.fd \
tex-omsuzc.fd \
tex-ot1uzc.fd \
tex-pzcmi.tfm \
tex-pzcmi.vf \
tex-pzcmi7t.tfm \
tex-pzcmi7t.vf \
tex-pzcmi8c.tfm \
tex-pzcmi8c.vf \
tex-pzcmi8r.tfm \
tex-pzcmi8t.tfm \
tex-pzcmi8t.vf \
tex-t1uzc.fd \
tex-ts1uzc.fd \
tex-uzc.map \
tex-uzcmi7t.tfm \
tex-uzcmi7t.vf \
tex-uzcmi8c.tfm \
tex-uzcmi8c.vf \
tex-uzcmi8r.tfm \
tex-uzcmi8t.tfm \
tex-uzcmi8t.vf \
texlive-zapfchan"

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
texlive-zapfchan-fonts"

inherit rpm
