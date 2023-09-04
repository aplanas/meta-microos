SUMMARY = "Managing character class schemes in XeTeX"
DESCRIPTION = "The package manages character class schemes of XeTeX. Using \
this package, you may switch among different character class \
schemes. Migration commands are provided for make packages \
using this mechanism compatible with each others."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn36312"

RPM_NAME = "texlive-interchar-2023.209.0.0.2svn36312-54.1.noarch.rpm"
RPM_HASH = "f8b5ed15b5dd55aeda82e98ff62415d9c81e69b96ecb5652637de91716bdde12f931a78a444b189423591a240c00d9b587c9533b4dd2b56499ad168e48ed314c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-interchar.sty \
texlive-interchar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
