SUMMARY = "Allow hyperref and natbib to work together"
DESCRIPTION = "Allows hyperref package and the natbib package with options \
'numbers' and 'sort&compress' to work together. This means that \
multiple sequential citations (e.g [3,2,1]) will be compressed \
to [1-3], where the '1' and the '3' are (color-)linked to the \
bibliography."
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.1.0bsvn17358"

RPM_NAME = "texlive-hypernat-2023.208.1.0bsvn17358-53.1.noarch.rpm"
RPM_HASH = "21cc19735e07126c4e63ad23364cfba33967b9382f48f27cd238691eb149d1ea9fe7f986b54b8b796e711e72d8fd3982e2e09180f7909c0f974ced0196e25d03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hypernat.sty \
texlive-hypernat"

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
