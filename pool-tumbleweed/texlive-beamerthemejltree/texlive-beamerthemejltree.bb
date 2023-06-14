SUMMARY = "Contributed beamer theme"
DESCRIPTION = "A theme for beamer presentations."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn21977"

RPM_NAME = "texlive-beamerthemejltree-2023.201.1.1svn21977-53.1.noarch.rpm"
RPM_HASH = "d5cbf086589ab2b0e163f52e024d512fde094c6f65a39466f7d8d2b1291f75118eff09abc87837d915cd90f1a5ac0820f467b31243169f0146317ed0654d142c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerthemeJLTree.sty \
texlive-beamerthemejltree"

RDEPENDS:${PN} += "/bin/sh \
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
