SUMMARY = "Font support for the Arka language"
DESCRIPTION = "The package supports typesetting hacm, the alphabet of the \
constructed language Arka. The bundle provides nine official \
fonts, in Adobe Type 1 format."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn27671"

RPM_NAME = "texlive-hacm-2023.201.0.0.1svn27671-53.2.noarch.rpm"
RPM_HASH = "aa3a275f1d1b4232627ca5bc1bfd6bacc68a09959db49d06444a08819315429bee90952932dd8e55a0ef16465aebef302466e268d9fca8678a4b4b0dfb862072"
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
