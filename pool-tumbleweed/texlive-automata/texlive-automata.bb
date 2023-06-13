SUMMARY = "Finite state machines, graphs and trees in MetaPost"
DESCRIPTION = "The package offers a collection of macros for MetaPost to make \
easier to draw finite-state machines, automata, labelled \
graphs, etc. The user defines nodes, which may be isolated or \
arranged into matrices or trees; edges connect pairs of nodes \
through arbitrary paths. Parameters, that specify the shapes of \
nodes and the styles of edges, may be adjusted."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn19717"

RPM_NAME = "texlive-automata-2023.201.0.0.3svn19717-53.1.noarch.rpm"
RPM_HASH = "a98df2dc31756d9f41d665da1f9776049266b994e7c577af5066bd564696913980e0c7db4421500623650ddfb30de480f4c678cd84c56bb044e81a5d8c8bbad5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-automata"

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
