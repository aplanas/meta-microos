SUMMARY = "Ecv documentation, in German"
DESCRIPTION = "This is a 'translation' of the ecv documentation."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn24754"

RPM_NAME = "texlive-translation-ecv-de-2023.201.svn24754-52.1.noarch.rpm"
RPM_HASH = "fce8bc7ce76d585fd63f319511402f7b3ee2d7d6da9ace3113057433d3f61dcdc61e0559a7f6a2034a1a72e03e3a15615657efed0a0b8a033d0a900dee620e44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-ecv-de"

RDEPENDS:${PN} += "/bin/sh \
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
