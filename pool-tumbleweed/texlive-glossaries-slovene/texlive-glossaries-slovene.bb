SUMMARY = "Slovene language module for glossaries package"
DESCRIPTION = "Slovene language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn51211"

RPM_NAME = "texlive-glossaries-slovene-2023.209.1.0svn51211-54.1.noarch.rpm"
RPM_HASH = "55d65f790e7bef9336261eca0b2615839b4e6c61336b7e22bf9d408687f7d57c23e5b7fc1aec5805323e19937e741ae5eaeda75b22d2f2ee588d6a698b2434b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-slovene.ldf \
texlive-glossaries-slovene"

RDEPENDS:${PN} += "/usr/bin/sh \
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
