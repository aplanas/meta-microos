SUMMARY = "Platonic solids in PSTricks"
DESCRIPTION = "The package adds to PSTricks the ability to draw 3-dimensional \
views of the five Platonic solids."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn16538"

RPM_NAME = "texlive-pst-platon-2023.209.0.0.01svn16538-54.1.noarch.rpm"
RPM_HASH = "55c047cf6b9d5d73afd43610a659302e2687520332343e14687e2ad93ec524674fac9acd4214e36fb9f74db3be3f9ca04f47070035d78b88714151a46bb6e72a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-platon.sty \
texlive-pst-platon"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-3d.sty \
tex-pst-xkey.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
