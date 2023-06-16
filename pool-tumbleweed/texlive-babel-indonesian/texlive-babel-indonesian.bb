SUMMARY = "Support for Indonesian within babel"
DESCRIPTION = "This is the babel style for Indonesian."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0msvn43235"

RPM_NAME = "texlive-babel-indonesian-2023.201.1.0msvn43235-53.1.noarch.rpm"
RPM_HASH = "0f08e5e7df5fb7003cdbbb6556b480eda84062f96e4699913b00cded4551d97cf32b8d0c003d431dcd3a395b982b704290a225bdf20abc39dff598599dab74d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bahasa.ldf \
tex-bahasai.ldf \
tex-indon.ldf \
tex-indonesian.ldf \
texlive-babel-indonesian"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
