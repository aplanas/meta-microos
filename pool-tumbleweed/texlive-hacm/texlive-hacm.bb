SUMMARY = "Font support for the Arka language"
DESCRIPTION = "The package supports typesetting hacm, the alphabet of the \
constructed language Arka. The bundle provides nine official \
fonts, in Adobe Type 1 format."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn27671"

RPM_NAME = "texlive-hacm-2023.209.0.0.1svn27671-54.1.noarch.rpm"
RPM_HASH = "4d84d443a8a3608f51b983329ccc7f31ccc2d5f523bd2bb24663a8f3dc0423be4816888c9db5b991567343538369769260a6a9be55eea2c3cd2c9f9066bf00f6"
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
