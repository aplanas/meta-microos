SUMMARY = "Tree macros using XY-Pic"
DESCRIPTION = "The package provides means to draw linguistic syntactic trees \
with ease and to support hopefully sufficient functionalities, \
that the linguist may need. The package (of course) depends on \
the XY-Pic package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn15878"

RPM_NAME = "texlive-xytree-2023.201.1.5svn15878-52.2.noarch.rpm"
RPM_HASH = "1b4c63dbeb6c2a81c0d8beb50e7af10c9998356f2c5991c4cf9618e2050552e21ddf7324d8d7f49dacce7bcb658c00a3dbc22492f1e193a3a7ef1d122dea2f21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xytree.sty \
texlive-xytree"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xy.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
