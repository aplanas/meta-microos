SUMMARY = "Japanese pTeX manual"
DESCRIPTION = "This package contains the Japanese pTeX manual. Feedback is \
welcome!"
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn66182"

RPM_NAME = "texlive-ptex-manual-2023.201.svn66182-53.2.noarch.rpm"
RPM_HASH = "7afff6d595a43340c9d252901ba593d392724ee5cab400c91d2a4ffa4b6b0eb7c6640007919de6f8f14c4d9b891b7fb25d3f3b024253deac29b92ebfd78144c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptex-manual"

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
