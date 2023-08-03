SUMMARY = "Fonts for use with upTeX"
DESCRIPTION = "The bundle contains fonts (TFM and VF) for use with upTeX. This \
is a redistribution derived from the upTeX distribution by \
Takuji Tanaka."
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn65657"

RPM_NAME = "texlive-uptex-fonts-2023.209.svn65657-54.1.noarch.rpm"
RPM_HASH = "16e28ec06351fb77e993c3ed3d12c729f20551894fbfefe00f9a2f936e9c69b10203f6acea45f7f8ec6b129656931d18d0e4462d6239a81123fac343cd2d9a40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-makejvf-upjis.cnf \
tex-makejvf-upjpn.cnf \
tex-ugbm.tfm \
tex-ugbmv.tfm \
tex-ugoth10.tfm \
tex-ugoth10.vf \
tex-umin10.tfm \
tex-umin10.vf \
tex-upgbm-h.tfm \
tex-upgbm-hq.tfm \
tex-upgbm-v.tfm \
tex-uphygt-h.tfm \
tex-uphygt-v.tfm \
tex-uphysmjm-h.tfm \
tex-uphysmjm-v.tfm \
tex-upjisg-h.tfm \
tex-upjisg-h.vf \
tex-upjisg-hq.tfm \
tex-upjisg-hq.vf \
tex-upjisg-v.tfm \
tex-upjisg-v.vf \
tex-upjisr-h.tfm \
tex-upjisr-h.vf \
tex-upjisr-hq.tfm \
tex-upjisr-hq.vf \
tex-upjisr-v.tfm \
tex-upjisr-v.vf \
tex-upjpngt-h.tfm \
tex-upjpngt-h.vf \
tex-upjpngt-v.tfm \
tex-upjpngt-v.vf \
tex-upjpnrm-h.tfm \
tex-upjpnrm-h.vf \
tex-upjpnrm-v.tfm \
tex-upjpnrm-v.vf \
tex-upkorgt-h.tfm \
tex-upkorgt-h.vf \
tex-upkorgt-v.tfm \
tex-upkorgt-v.vf \
tex-upkorrm-h.tfm \
tex-upkorrm-h.vf \
tex-upkorrm-v.tfm \
tex-upkorrm-v.vf \
tex-upmhm-h.tfm \
tex-upmhm-v.tfm \
tex-upmsl-h.tfm \
tex-upmsl-v.tfm \
tex-uprml-h.tfm \
tex-uprml-hq.tfm \
tex-uprml-v.tfm \
tex-upschgt-h.tfm \
tex-upschgt-h.vf \
tex-upschgt-v.tfm \
tex-upschgt-v.vf \
tex-upschrm-h.tfm \
tex-upschrm-h.vf \
tex-upschrm-v.tfm \
tex-upschrm-v.vf \
tex-upstht-h.tfm \
tex-upstht-v.tfm \
tex-upstsl-h.tfm \
tex-upstsl-v.tfm \
tex-uptchgt-h.tfm \
tex-uptchgt-h.vf \
tex-uptchgt-v.tfm \
tex-uptchgt-v.vf \
tex-uptchrm-h.tfm \
tex-uptchrm-h.vf \
tex-uptchrm-v.tfm \
tex-uptchrm-v.vf \
tex-urml.tfm \
tex-urmlv.tfm \
tex-utgoth10.tfm \
tex-utgoth10.vf \
tex-utmin10.tfm \
tex-utmin10.vf \
texlive-uptex-fonts"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-gbm.tfm \
tex-rml.tfm \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
