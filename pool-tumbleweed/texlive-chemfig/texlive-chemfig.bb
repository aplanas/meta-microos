SUMMARY = "Draw molecules with easy syntax"
DESCRIPTION = "The package provides the command \\chemfig{<code>}, which draws \
molecules using the TikZ package. The <code> argument provides \
instructions for the drawing operation. While the diagrams \
produced are essentially 2-dimensional, the package supports \
many of the conventional notations for illustrating the \
3-dimensional layout of a molecule. The package uses TikZ for \
its actual drawing operations."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6dsvn65912"

RPM_NAME = "texlive-chemfig-2023.201.1.6dsvn65912-53.1.noarch.rpm"
RPM_HASH = "c3c47ddb1ac3995b936725ba9f65db6f519f1d97f1b0be056cbd426ff341ad35de1ae533b4008b0e00ccc7d2e19edd976c83e02ff82db338234975301ca4575c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(chemfig-lewis.tex) \
tex(chemfig.sty) \
tex(chemfig.tex) \
texlive-chemfig"

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
