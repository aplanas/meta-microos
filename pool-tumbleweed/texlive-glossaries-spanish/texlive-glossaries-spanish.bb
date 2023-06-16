SUMMARY = "Spanish language module for glossaries package"
DESCRIPTION = "Spanish language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-spanish-2023.201.1.0svn35665-53.1.noarch.rpm"
RPM_HASH = "e981eb6bed22e68d6df9d4166ad775b8d135a7ab668e5e90051773e0728ffbc05d886548b86ea9e01bc9f277b46c103af8da0f8e253aaba686c1438b98787ee0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-spanish-noenc.ldf \
tex-glossaries-spanish-utf8.ldf \
tex-glossaries-spanish.ldf \
texlive-glossaries-spanish"

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
