SUMMARY = "Spanish language module for glossaries package"
DESCRIPTION = "Spanish language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-spanish-2023.201.1.0svn35665-53.2.noarch.rpm"
RPM_HASH = "f7c6454a4da942dde054af05abbcd24d01d3c49b88f72bb6474d88eb03dcffa3476effe39159d76c227320d4fce5345035b33a0833eaf1b40c7fa80777256152"
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
