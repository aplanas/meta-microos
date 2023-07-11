SUMMARY = "French language module for glossaries package"
DESCRIPTION = "French language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn42873"

RPM_NAME = "texlive-glossaries-french-2023.201.1.1svn42873-53.2.noarch.rpm"
RPM_HASH = "ee21a1a7161833e5fb3d6f6d9f86a61461b70b8458e56ec5bab69c5f150f500dda7837ded0497461449a72c0b21c66998c1239369ded5dfb4d77f12e65043793"
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
