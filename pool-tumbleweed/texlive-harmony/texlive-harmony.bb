SUMMARY = "Typeset harmony symbols, etc., for musicology"
DESCRIPTION = "The package harmony.sty uses the packages ifthen and amssymb \
from the amsfonts bundle, together with the LaTeX font \
lcirclew10 and the font musix13 from musixtex."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-harmony-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "d6042a2ed0569c04308be12d22ac3db04b58b80eb9448b7fb7ed8322a2493c4b04f5b07c547223cf66b8f1fafd92ce61d237746b0e52b22aca4e221b528ee5ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(harmony.sty) \
texlive-harmony"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amssymb.sty) \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
