SUMMARY = "Documentation for Mendex index processor"
DESCRIPTION = "This package provides documentation for Mendex (Japanese index \
processor). The source code of the program is not included, it \
can be obtained from TeX Live subversion repository."
LICENSE = "BSD-3-Clause"

PV = "2023.208.svn62914"

RPM_NAME = "texlive-mendex-doc-2023.208.svn62914-53.1.noarch.rpm"
RPM_HASH = "9af591374b0498f7914cac808daa438e596980017fe102da49d88a773c07d26ab8208e32a05862e7be51a6a92d3aa85f739c6b0c08532f5d85eba293630bc1f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mendex-doc"

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
