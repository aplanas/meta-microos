SUMMARY = "BibTeX style for KSFH Munich"
DESCRIPTION = "The package supports bibliographies as standard for KSFH \
(Katholische Stiftungsfachhochschule) Munich. BibTeX entries in \
article, book, inbook, incollection and misc formats are \
supported."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn24825"

RPM_NAME = "texlive-ksfh_nat-2023.201.1.1svn24825-55.1.noarch.rpm"
RPM_HASH = "b0cb106578ba3077b6e8ed2b3d96692f2bb9d71a50cb9424dec23a2bec8b6ca99c7c817ccbf01ff22ecb0852b2abd3420b63ef55b6a7a2ce79ec711552dfaa09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ksfh-nat"

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
