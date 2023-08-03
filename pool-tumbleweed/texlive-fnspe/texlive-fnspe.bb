SUMMARY = "Macros for supporting mainly students of FNSPE CTU in Prague"
DESCRIPTION = "This package is primary intended for students of FNSPE CTU in \
Prague but many other students or scientists can found this \
package as useful. This package implements different standards \
of tensor notation, interval notation and complex notation. \
Further many macros and shortcuts are added, e.q. for spaces, \
operators, physics unit, etc."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2asvn45360"

RPM_NAME = "texlive-fnspe-2023.209.1.2asvn45360-53.1.noarch.rpm"
RPM_HASH = "f6c5f42ed89bf250c38ec270334c469bf9b5eb3fe7db201ed941f9bd44ea6f50dbb10d9afc254ce6484a0923c0a60a30a3db0cb2fd3477119e4a2ca7b4c2a1d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fnspe.sty \
texlive-fnspe"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-bm.sty \
tex-listings.sty \
tex-mathrsfs.sty \
tex-mathtools.sty \
tex-physics.sty \
tex-substr.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
