SUMMARY = "New column types for array and tabular environments"
DESCRIPTION = "This small package provides new column types for array and \
tabular environments, horizontally and vertically centered, or \
with adjusted height for big mathematical expressions. The \
columns width can be fixed or calculated like in tabularx \
environments. Macros for drawing vertical and horizontal rules \
of variable thickness are also provided."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn61719"

RPM_NAME = "texlive-arraycols-2023.209.1.2svn61719-54.1.noarch.rpm"
RPM_HASH = "63c909dae8b6101114f922c3116a34f92da75b8312da2cf6b8264072bb74e323a3765c32606899746aab334c25a3fd6739676b31abf09b5d849d2b9cd4ef1614"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arraycols.sty \
texlive-arraycols"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-cellspace.sty \
tex-makecell.sty \
tex-tabularx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
