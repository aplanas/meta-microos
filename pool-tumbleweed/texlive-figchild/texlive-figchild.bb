SUMMARY = "Pictures for creating children's activities"
DESCRIPTION = "This package was created with the aim of facilitating the work \
of Elementary School teachers who need to create colorful and \
attractive activities for their students. It is a product of \
the Computational Mathematics discipline offered at the Federal \
University of Vicosa -- Campus UFV -- Florestal by professor \
Fernando de Souza Bastos. It makes use of the TikZ and xcolor \
packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.1svn62945"

RPM_NAME = "texlive-figchild-2023.209.2.1.1svn62945-53.1.noarch.rpm"
RPM_HASH = "317eb86da40b06dffcb1f5626a49fbf9b1528627227f75df619a7c5b359d7185b7cbc8a4eddebe0e528a164d4f1ca204e1c5bfb1f973ec3ea2b98d3858c2faf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-figchild.sty \
texlive-figchild"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
