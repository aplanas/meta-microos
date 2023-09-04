SUMMARY = "Font support for the Arka language"
DESCRIPTION = "The package supports typesetting hacm, the alphabet of the \
constructed language Arka. The bundle provides nine official \
fonts, in Adobe Type 1 format."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn27671"

RPM_NAME = "texlive-hacm-2023.209.0.0.1svn27671-54.2.noarch.rpm"
RPM_HASH = "a6840c42a2830173f0cd2e1481aa1fa7581bcff0c90eb4b7ddea69cea97411669799cc779d5137b776ab98479d9134a356fad300d385609d7fd6683899d15a44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-alblant.tfm \
tex-alblant.vf \
tex-defans.tfm \
tex-defans.vf \
tex-fenlil.tfm \
tex-fenlil.vf \
tex-fialis.tfm \
tex-fialis.vf \
tex-hacm.map \
tex-hacm.sty \
tex-inje.tfm \
tex-inje.vf \
tex-kardinal.tfm \
tex-kardinal.vf \
tex-lantia.tfm \
tex-lantia.vf \
tex-nalnia.tfm \
tex-nalnia.vf \
tex-olivia.tfm \
tex-olivia.vf \
tex-ot1halb.fd \
tex-ot1hdef.fd \
tex-ot1hfen.fd \
tex-ot1hfia.fd \
tex-ot1hinj.fd \
tex-ot1hkar.fd \
tex-ot1hlan.fd \
tex-ralblant.tfm \
tex-rdefans.tfm \
tex-rfenlil.tfm \
tex-rfialis.tfm \
tex-rinje.tfm \
tex-rkardinal.tfm \
tex-rlantia.tfm \
tex-rnalnia.tfm \
tex-rolivia.tfm \
texlive-hacm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-hacm-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
