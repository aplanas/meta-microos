SUMMARY = "Set of slide fonts based on CM"
DESCRIPTION = "The bundle contains the traditional slides fonts revised to be \
completely usable both as text fonts and mathematics fonts; \
they are fully integrate with the new operators, letters, \
symbols and extensible delimiter fonts, as well as with the AMS \
fonts, all redone with the same stylistic parameters."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0bsvn32354"

RPM_NAME = "texlive-lxfonts-2023.201.2.0bsvn32354-52.1.noarch.rpm"
RPM_HASH = "73086f1e42b2142ab1bbec2b3c3235e1260dfa203b5b5d3b1e8c48ac88f4abbbc4e436f68406c5e5cf96894d2cc777a29d532ad264476b85a9c8944bf347c741"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lcmbsy8.tfm \
tex-lcmex8.tfm \
tex-lcmmi8.tfm \
tex-lcmmib8.tfm \
tex-lcmsy8.tfm \
tex-leclb8.tfm \
tex-lecli8.tfm \
tex-leclo8.tfm \
tex-leclq8.tfm \
tex-lgrllcmss.fd \
tex-lgrllcmtt.fd \
tex-llasy8.tfm \
tex-llasyb8.tfm \
tex-llcmss8.tfm \
tex-llcmssb8.tfm \
tex-llcmssi8.tfm \
tex-llcmsso8.tfm \
tex-lmsam8.tfm \
tex-lmsbm8.tfm \
tex-ltclb8.tfm \
tex-ltcli8.tfm \
tex-ltclo8.tfm \
tex-ltclq8.tfm \
tex-lxfonts.map \
tex-lxfonts.sty \
tex-omlllcmm.fd \
tex-omsllcmsy.fd \
tex-omxllcmex.fd \
tex-ot1llcmss.fd \
tex-ot1llcmtt.fd \
tex-t1llcmss.fd \
tex-t1llcmtt.fd \
tex-ts1llcmss.fd \
tex-ulllasy.fd \
tex-ulmsa.fd \
tex-ulmsb.fd \
texlive-lxfonts"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lxfonts-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
