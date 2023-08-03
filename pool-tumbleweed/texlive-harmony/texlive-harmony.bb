SUMMARY = "Typeset harmony symbols, etc., for musicology"
DESCRIPTION = "The package harmony.sty uses the packages ifthen and amssymb \
from the amsfonts bundle, together with the LaTeX font \
lcirclew10 and the font musix13 from musixtex."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-harmony-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "c9575c03432f7dc167bf1233849cf33daeb3ed120d025ad9552236352b4f62435c65827e450e884f3e8d68e82fe37e48b144375a95872c27a037da0ae4fade48"
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
