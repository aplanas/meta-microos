SUMMARY = "Typeset harmony symbols, etc., for musicology"
DESCRIPTION = "The package harmony.sty uses the packages ifthen and amssymb \
from the amsfonts bundle, together with the LaTeX font \
lcirclew10 and the font musix13 from musixtex."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-harmony-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "a2ce5ce923379a0d9fdd94db3d206645ed719f9dbcd6748cfaf94db0f55441d98b2b9bb05cb9ca3674178f3904fdd5ae4a28dfa8e102d76cd8417a36322fd5c9"
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
