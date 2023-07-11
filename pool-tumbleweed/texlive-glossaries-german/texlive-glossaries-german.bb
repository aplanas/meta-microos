SUMMARY = "German language module for glossaries package"
DESCRIPTION = "German language module for the glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-german-2023.201.1.0svn35665-53.2.noarch.rpm"
RPM_HASH = "96531a6546debd9ad258921770ca370d88a2290834a9a5c22b7a62c468888b6cb87a2b61a761a3d228d82f29b50af239a5163737cdb12797d241ff13e78fcc5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-german.ldf \
texlive-glossaries-german"

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
