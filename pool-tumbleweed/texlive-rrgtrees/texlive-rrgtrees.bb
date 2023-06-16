SUMMARY = "Linguistic tree diagrams for Role and Reference Grammar (RRG) with LaTeX"
DESCRIPTION = "A set of LaTeX macros that makes it easy to produce linguistic \
tree diagrams suitable for Role and Reference Grammar (RRG). \
This package allows the construction of trees with crossing \
lines, as is required by this theory for many languages. There \
is no known limit on number of tree nodes or levels. Requires \
the pst-node and pst-tree LaTeX packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn27322"

RPM_NAME = "texlive-rrgtrees-2023.201.1.1svn27322-53.1.noarch.rpm"
RPM_HASH = "81ef03eb2825ee35dea07eec38db6efa4ae380f7ffcd9c9245d251bea4a20f8f3ca60f0abaca51fbb8c086bc8151213238651da3dd2ec8f6bfc395b1d54f438a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rrgtrees.sty \
texlive-rrgtrees"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-node.sty \
tex-pst-tree.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
