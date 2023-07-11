SUMMARY = "Magyar language module for glossaries package"
DESCRIPTION = "Magyar language module for glossariesr package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-magyar-2023.201.1.0svn35665-53.2.noarch.rpm"
RPM_HASH = "5c5996bc1ffe65b36dda36efd17878cbe22440546bc9728dcba9302da2ce8aad4fe04e30c3d42b502403ad122e33f30dc40e2a2884b136a1ddb5da65a5b1689c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-magyar-noenc.ldf \
tex-glossaries-magyar-utf8.ldf \
tex-glossaries-magyar.ldf \
texlive-glossaries-magyar"

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
