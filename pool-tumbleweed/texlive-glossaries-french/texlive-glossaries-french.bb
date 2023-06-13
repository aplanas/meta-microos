SUMMARY = "French language module for glossaries package"
DESCRIPTION = "French language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn42873"

RPM_NAME = "texlive-glossaries-french-2023.201.1.1svn42873-53.1.noarch.rpm"
RPM_HASH = "d480de70d6f4eeebc41d8999c6c523f756e75ba16dff5c99828ba8d280e13da3ec3bf208c84b940619717466418dee1414c30a0efc8e89c310b38ff22c9943a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(glossaries-french.ldf) \
texlive-glossaries-french"

RDEPENDS:${PN} += "/bin/sh \
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
