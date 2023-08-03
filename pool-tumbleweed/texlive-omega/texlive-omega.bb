SUMMARY = "A wide-character-set extension of TeX"
DESCRIPTION = "A development of TeX, which deals in multi-octet Unicode \
characters, to enable native treatment of a wide range of \
languages without changing character-set. Work on Omega has \
ceased (the TeX Live package contains only support files); its \
compatible successor is aleph, which is itself also in major \
maintenance mode only. Ongoing projects developing Omega (and \
Aleph) ideas include Omega-2 and LuaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn33046"

RPM_NAME = "texlive-omega-2023.209.svn33046-55.1.noarch.rpm"
RPM_HASH = "5647549b72204113ca3f7032fe583fff3d386fc0bc0eaa4e2c554173c579f7c65bf6156ea48e08e03da239748e82f81764b65d825b2bd29ddc205164d6c29699"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bghyph.tex \
tex-grlccode.tex \
tex-lthyph.tex \
tex-omding.tfm \
tex-omega.cfg \
tex-omega.map \
tex-omega.tex \
tex-omsea1.tfm \
tex-omsea1b.tfm \
tex-omsea2.tfm \
tex-omsea2b.tfm \
tex-omsea3.tfm \
tex-omsea3b.tfm \
tex-omseco.tfm \
tex-omsecob.tfm \
tex-omsecobi.tfm \
tex-omsecoi.tfm \
tex-omsecx.tfm \
tex-omsecy.tfm \
tex-omsegr.tfm \
tex-omsegrb.tfm \
tex-omsegrbi.tfm \
tex-omsegri.tfm \
tex-omseha.tfm \
tex-omseip.tfm \
tex-omsela.tfm \
tex-omselab.tfm \
tex-omselabi.tfm \
tex-omselai.tfm \
tex-omseti.tfm \
tex-omssti.tfm \
tex-srhyph.tex \
texlive-omega"

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
texlive-omega-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
