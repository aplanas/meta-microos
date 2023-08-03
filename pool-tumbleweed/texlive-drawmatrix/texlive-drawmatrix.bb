SUMMARY = "Draw visual representations of matrices in LaTeX"
DESCRIPTION = "The package provides macros to visually represent matrices. \
Various options allow to change the visualizations, e.g., \
drawing rectangular, triangular, or banded matrices."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5.0svn44471"

RPM_NAME = "texlive-drawmatrix-2023.209.1.5.0svn44471-53.1.noarch.rpm"
RPM_HASH = "90828117624343443b87cbde295d6d5214e6444fd1ad441cb959631562a30a61449728fb649e04c6b063bf1c26995189c5c82dee592f7a24d7dd211d95cd5a76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-drawmatrix.sty \
texlive-drawmatrix"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
