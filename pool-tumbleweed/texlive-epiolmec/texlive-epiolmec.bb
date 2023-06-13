SUMMARY = "Typesetting the Epi-Olmec Language"
DESCRIPTION = "The package contains all the necessary files to typeset \
Epi-Olmec 'documents', in a script used in Southern Middle \
America until about 500 AD."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-epiolmec-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "63fed28abd7ce349ef7b48a26e7fc6bb956d8f7ab928db9d1bf1b72337dc669c91b5a72616e3c7365b375217f1239d3efe511bbe0821b04a80fe2571df449648"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(EpiOlmec.tfm) \
tex(epiolmec.map) \
tex(epiolmec.sty) \
texlive-epiolmec"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-epiolmec-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
