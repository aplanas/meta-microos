SUMMARY = "Euclidian geometry with PSTricks"
DESCRIPTION = "The package allows the drawing of Euclidean geometric figures \
using TeX pstricks macros for specifying mathematical \
constraints. It is thus possible to build point using common \
transformations or intersections. The use of coordinates is \
limited to points which controlled the figure."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.75svn56474"

RPM_NAME = "texlive-pst-eucl-2023.201.1.75svn56474-52.1.noarch.rpm"
RPM_HASH = "246ccd9b226e636c430f5a22b353b875d3b4fd0ae8fe35de959121b5b7b9be01c7888f98a2ba21c91c5806476cde1ddc00471f8a0b8d51be50b82ba273602a5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-eucl.sty \
tex-pst-eucl.tex \
texlive-pst-eucl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-calculate.sty \
tex-pst-node.sty \
tex-pst-tools.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
