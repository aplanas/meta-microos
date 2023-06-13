SUMMARY = "Draw visual representations of matrices in LaTeX"
DESCRIPTION = "The package provides macros to visually represent matrices. \
Various options allow to change the visualizations, e.g., \
drawing rectangular, triangular, or banded matrices."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5.0svn44471"

RPM_NAME = "texlive-drawmatrix-2023.201.1.5.0svn44471-52.1.noarch.rpm"
RPM_HASH = "d34169196a62740963ce1183a4e3162d2227d56f595c6e8e1661ba57ab0547a687ebc6638718ad8bf4c244b3cd36ecd10568683aef7fd5f85ae624736b68f260"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(drawmatrix.sty) \
texlive-drawmatrix"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
