SUMMARY = "Add ~ after non-syllabic preposition, for Czech/Slovak"
DESCRIPTION = "Preprocessor for TeX source implementing the Czech/Slovak \
typographical rule forbidding a non-syllabic preposition alone \
at the end of a line."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66186"

RPM_NAME = "texlive-vlna-2023.201.svn66186-53.1.noarch.rpm"
RPM_HASH = "c5bab17e7e50ef086ddc655570a63c83e8bf2f3d0c99e6511bcecffd7e8240ec8e38bf0f395905f75d122043e2d8fce080c840e547c2fc438d1d81b1b344ad9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-vlna.1 \
texlive-vlna"

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
texlive-scripts-bin \
texlive-vlna-bin"

inherit rpm
