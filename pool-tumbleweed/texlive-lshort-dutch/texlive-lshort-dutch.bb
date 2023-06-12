SUMMARY = "Introduction to LaTeX in Dutch"
DESCRIPTION = "This is the Dutch (Nederlands) translation of the Short \
Introduction to LaTeX2e."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3svn15878"

RPM_NAME = "texlive-lshort-dutch-2023.201.1.3svn15878-54.1.noarch.rpm"
RPM_HASH = "74d436313287e1e242b927ed2061ae276460574b326d5303aa2050267524b1ef8c8bdaa3afa1a3ca1e48be6bf389cb18fda2402d8f0077a453074799fad5bc69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-dutch"
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
