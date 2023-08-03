SUMMARY = "Special arrows for PSTricks"
DESCRIPTION = "This package has all the code from the package pstricks-add \
which was related to arrows, like multiple arrows and so on."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.05svn61069"

RPM_NAME = "texlive-pst-arrow-2023.209.0.0.05svn61069-53.1.noarch.rpm"
RPM_HASH = "5f8ea096b0c44c570f39c9d59372a26519b62c1b4b2786c61ed29bfd3d57ecd3f00cf0d1f7d506b5febcf6127ef284b8f8a08e62200d3406d3d6433c24fcbd1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-arrow.sty \
tex-pst-arrow.tex \
texlive-pst-arrow"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
