SUMMARY = "Danish language module for glossaries package"
DESCRIPTION = "Danish language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-danish-2023.201.1.0svn35665-53.2.noarch.rpm"
RPM_HASH = "a808b61c46b160296a09c2eb6b3798d83539e7b7717d2bdb897759b7f80090ecace2e323cb6ef88bb0de91d8352cbac0e050c739fe96bc6a6f88848f0d81debb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-danish.ldf \
texlive-glossaries-danish"

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
