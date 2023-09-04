SUMMARY = "Typesetting the Epi-Olmec Language"
DESCRIPTION = "The package contains all the necessary files to typeset \
Epi-Olmec 'documents', in a script used in Southern Middle \
America until about 500 AD."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-epiolmec-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "ff87b758becb1f2af04816ad7fa24ef6edccae6f039fe84a18a5b6b1b5e6b137f1c591a8c7e0e89dec9cbb0e6e6cd9df70f1c36df1e0cd467facc06fb528cecc"
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
