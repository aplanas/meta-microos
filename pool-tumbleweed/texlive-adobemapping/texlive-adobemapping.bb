SUMMARY = "Adobe cmap and pdfmapping files"
DESCRIPTION = "The package comprises the collection of CMap and PDF mapping \
files made available for distribution by Adobe."
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn66552"

RPM_NAME = "texlive-adobemapping-2023.201.svn66552-54.1.noarch.rpm"
RPM_HASH = "e673796119b59b47696f687bd2866df78c66b6ba168840707d8c49e34ddb03e45275ff28588b1c7c2ec252f63081fea8057ac70fb4d0c6151cf7f2d946d5af3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adobemapping"

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
