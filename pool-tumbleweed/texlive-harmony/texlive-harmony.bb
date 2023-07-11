SUMMARY = "Typeset harmony symbols, etc., for musicology"
DESCRIPTION = "The package harmony.sty uses the packages ifthen and amssymb \
from the amsfonts bundle, together with the LaTeX font \
lcirclew10 and the font musix13 from musixtex."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-harmony-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "51c14e600376edb68698a2fc35690664de98f737a35d27f25dcdd624382b9bc273429c2434fa8d96e97cf7f1a1fc1ef0143ce85dbc22021b5b8d5cd296329517"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-harmony.sty \
texlive-harmony"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
