SUMMARY = "Publication quality tables in LaTeX"
DESCRIPTION = "The package enhances the quality of tables in LaTeX, providing \
extra commands as well as behind-the-scenes optimisation. \
Guidelines are given as to what constitutes a good table in \
this context. From version 1.61, the package offers longtable \
compatibility."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.61803398svn53402"

RPM_NAME = "texlive-booktabs-2023.209.1.61803398svn53402-53.1.noarch.rpm"
RPM_HASH = "7a7a7aba99d45bfd64a421d697cc063c85512fc3cd95b278da96e26cf34462c326e2d9b1dbf287c1434d0eeb367e1fef44a6bd4ba662878a23a612b9dce7cb37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-booktabs.sty \
texlive-booktabs"

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
