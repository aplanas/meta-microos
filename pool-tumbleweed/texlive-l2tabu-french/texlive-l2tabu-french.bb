SUMMARY = "French translation of l2tabu"
DESCRIPTION = "French translation of l2tabu."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.3svn31315"

RPM_NAME = "texlive-l2tabu-french-2023.201.2.3svn31315-55.1.noarch.rpm"
RPM_HASH = "541d3c6f231ca4308a01c00a8c994e4bb436c9674dcdaf4ec8455499377fcd64a2d15c1da1fa886f956855903cf27257d6004e8d5cf58fec3824a2ba9c48f366"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l2tabu-french"
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
