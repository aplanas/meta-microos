SUMMARY = "Typesetting the Epi-Olmec Language"
DESCRIPTION = "The package contains all the necessary files to typeset \
Epi-Olmec 'documents', in a script used in Southern Middle \
America until about 500 AD."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-epiolmec-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "8059075236f84b6825a90b5ee60e65259d7417b66be9b45e5939788764ec17dcd0760124af710c15208123803aa2a761abbab4f79fb38df5c1ec46b2a7d64f06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-EpiOlmec.tfm \
tex-epiolmec.map \
tex-epiolmec.sty \
texlive-epiolmec"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-epiolmec-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
