SUMMARY = "C version of tie (merging Web change files)"
DESCRIPTION = "This is a version of tie converted for use with cweb."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn66186"

RPM_NAME = "texlive-ctie-2023.209.1.1svn66186-55.1.noarch.rpm"
RPM_HASH = "ef7f9cb78c676bfae68d97734a225f80dfcdd8f00fd30da9e45370ab7a8d294dd1bd4db5d12552504c2caabd4ec211753fcfad1130b019079414477d41610c35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-ctie.1 \
texlive-ctie"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-ctie-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
