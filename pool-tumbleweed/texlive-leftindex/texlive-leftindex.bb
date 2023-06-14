SUMMARY = "Left indices with better spacing"
DESCRIPTION = "This package provides commands for typesetting left indices. \
Unlike other similar packages, leftindex also indents the left \
superscript, providing much better spacing in general."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1betasvn56182"

RPM_NAME = "texlive-leftindex-2023.201.0.0.1betasvn56182-54.1.noarch.rpm"
RPM_HASH = "f705abd29c1c649e2f2ea2c6233f09eb91ab04200489d119e576246296182bf94cd5d7334acdfa73c654d4c22ac4a20ae1da35ed4efa01fa0634039335b3f125"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-leftindex.sty \
texlive-leftindex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-mathtools.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
