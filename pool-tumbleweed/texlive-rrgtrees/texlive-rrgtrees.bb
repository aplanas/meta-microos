SUMMARY = "Linguistic tree diagrams for Role and Reference Grammar (RRG) with LaTeX"
DESCRIPTION = "A set of LaTeX macros that makes it easy to produce linguistic \
tree diagrams suitable for Role and Reference Grammar (RRG). \
This package allows the construction of trees with crossing \
lines, as is required by this theory for many languages. There \
is no known limit on number of tree nodes or levels. Requires \
the pst-node and pst-tree LaTeX packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn27322"

RPM_NAME = "texlive-rrgtrees-2023.209.1.1svn27322-54.1.noarch.rpm"
RPM_HASH = "97f0a6bb9301d5c2423fc43b371a89686c35e825e8a5b2ced790218dbdd961ef92285e8e07c9db69b11daea2af16836a1c0a90fd1a8d321e101dab12eec4282c"
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
