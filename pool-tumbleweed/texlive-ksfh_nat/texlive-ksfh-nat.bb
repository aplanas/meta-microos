SUMMARY = "BibTeX style for KSFH Munich"
DESCRIPTION = "The package supports bibliographies as standard for KSFH \
(Katholische Stiftungsfachhochschule) Munich. BibTeX entries in \
article, book, inbook, incollection and misc formats are \
supported."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn24825"

RPM_NAME = "texlive-ksfh_nat-2023.209.1.1svn24825-56.1.noarch.rpm"
RPM_HASH = "a2bfa71585f6d745922cd46e93fae4f714432bffe8f95d8b0f26fa1b3d76dddb73b45c07906517636acbfcc35b0a58b1f721398bc49f33a154928b2347664254"
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
