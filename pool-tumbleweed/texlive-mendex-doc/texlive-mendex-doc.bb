SUMMARY = "Documentation for Mendex index processor"
DESCRIPTION = "This package provides documentation for Mendex (Japanese index \
processor). The source code of the program is not included, it \
can be obtained from TeX Live subversion repository."
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn62914"

RPM_NAME = "texlive-mendex-doc-2023.201.svn62914-52.1.noarch.rpm"
RPM_HASH = "d117118f1d1b532064b66e870168bd1e6bc9dcaeac0be3cffe6980a8ceffee9f16f44525317e1b47694a41ef365b38a2f77695a7380cba91f42b3190d0f6815b"
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
