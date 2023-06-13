SUMMARY = "Special arrows for PSTricks"
DESCRIPTION = "This package has all the code from the package pstricks-add \
which was related to arrows, like multiple arrows and so on."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.05svn61069"

RPM_NAME = "texlive-pst-arrow-2023.201.0.0.05svn61069-52.1.noarch.rpm"
RPM_HASH = "89f1c546052ceed44a9d787769000b5995eeadeca22eea7030caa9985e27af977e6aad7e844529d06079234ec33244c861f3b5645b3cb4427bfcf136f388baa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-arrow.sty) \
tex(pst-arrow.tex) \
texlive-pst-arrow"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
