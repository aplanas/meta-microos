SUMMARY = "Boxes and picture macros with Japanese vertical writing support"
DESCRIPTION = "The bundle provides boxes and picture macros with Japanese \
vertical writing support. It uses only native picture macros \
and fonts for drawing boxes and is thus driver-independent. \
Formerly part of the Japanese pLaTeX bundle, it now supports \
all LaTeX engines."
LICENSE = "BSD-3-Clause"

PV = "2023.201.2.1svn53411"

RPM_NAME = "texlive-ascmac-2023.201.2.1svn53411-53.1.noarch.rpm"
RPM_HASH = "b5a793c8a9c21ee02f09916e293b1798b8c9dcfc0ed193adb604d138271510e2a1dfd7694fd30d384e187bb243996262e9cc0c2f22f4b133a6bce2e2a2b47730"
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
