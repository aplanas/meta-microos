SUMMARY = "Typesetting the Epi-Olmec Language"
DESCRIPTION = "The package contains all the necessary files to typeset \
Epi-Olmec 'documents', in a script used in Southern Middle \
America until about 500 AD."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-epiolmec-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "3593e86ab2c5d921fbe92b82e48cb91ed7a0cf0a7dc3a235b6640240fbd3d28c986c8d0af7ee618423aebd33ea63b12ba7c6314cdc8b6c743de4ce3d7df439f4"
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
