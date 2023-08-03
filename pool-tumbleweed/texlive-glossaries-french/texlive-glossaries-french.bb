SUMMARY = "French language module for glossaries package"
DESCRIPTION = "French language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn42873"

RPM_NAME = "texlive-glossaries-french-2023.209.1.1svn42873-54.1.noarch.rpm"
RPM_HASH = "27884b1564f7e068a0941c8cbf3a38edfc868437c88620bf2a7c71494d194bdf5953fc86394b53809c0ec8263c7cab7cbcaf26c374754dd768c884cd03ffc7aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-french.ldf \
texlive-glossaries-french"

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
