SUMMARY = "Serbian language module for glossaries package"
DESCRIPTION = "Serbian language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-serbian-2023.209.1.0svn35665-54.1.noarch.rpm"
RPM_HASH = "bc5afe75d3e0b35fdfb331cfd5a1245b66ba06555000ed601bc5dc0acc989ce6429af3deaf21a50efb1ec131caae193e1995e6ce8b24b8b3b2a5ee98d5f13f8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-serbian-noenc.ldf \
tex-glossaries-serbian-utf8.ldf \
tex-glossaries-serbian.ldf \
texlive-glossaries-serbian"

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
