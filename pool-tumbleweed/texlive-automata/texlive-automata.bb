SUMMARY = "Finite state machines, graphs and trees in MetaPost"
DESCRIPTION = "The package offers a collection of macros for MetaPost to make \
easier to draw finite-state machines, automata, labelled \
graphs, etc. The user defines nodes, which may be isolated or \
arranged into matrices or trees; edges connect pairs of nodes \
through arbitrary paths. Parameters, that specify the shapes of \
nodes and the styles of edges, may be adjusted."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn19717"

RPM_NAME = "texlive-automata-2023.209.0.0.3svn19717-54.1.noarch.rpm"
RPM_HASH = "e16fcae45cca601055d5efe3244375a62578453f56b994fc68cc89ca042f62bf32ded97ad761c353790c95319f9dc8f51ec2b022a8a8f62b18fd99c6f9821cf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-automata"

RDEPENDS:${PN} += "/usr/bin/sh \
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
