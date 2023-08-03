SUMMARY = "Boxes and picture macros with Japanese vertical writing support"
DESCRIPTION = "The bundle provides boxes and picture macros with Japanese \
vertical writing support. It uses only native picture macros \
and fonts for drawing boxes and is thus driver-independent. \
Formerly part of the Japanese pLaTeX bundle, it now supports \
all LaTeX engines."
LICENSE = "BSD-3-Clause"

PV = "2023.209.2.1svn53411"

RPM_NAME = "texlive-ascmac-2023.209.2.1svn53411-54.1.noarch.rpm"
RPM_HASH = "158f94b6781fee717ac4e87bb202bfdfa066c7b9826860903c8c95a7437449c09d5cf62c1d412a47846024d7f9da23ed3c5ae5b0e7053cf75f123b3dc122fb42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ascgrp.tfm \
tex-ascii10.tfm \
tex-ascii36.tfm \
tex-ascmac.map \
tex-ascmac.sty \
tex-tascmac.sty \
texlive-ascmac"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-ascmac-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
