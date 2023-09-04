SUMMARY = "Tree macros using XY-Pic"
DESCRIPTION = "The package provides means to draw linguistic syntactic trees \
with ease and to support hopefully sufficient functionalities, \
that the linguist may need. The package (of course) depends on \
the XY-Pic package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn15878"

RPM_NAME = "texlive-xytree-2023.209.1.5svn15878-53.2.noarch.rpm"
RPM_HASH = "2f54f86d65a41b6e3259f4a6f93e1bcb4133b48c7addd67cd9cc67a59ca2d49f365bf485367af3c7cfaee5fc86d6e5da24e44e867ad0b6d66fc19f6ff6efef96"
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
