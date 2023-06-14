SUMMARY = "Dijkstra algorithm for LaTeX"
DESCRIPTION = "This small package uses the Dijkstra algorithm for weighted \
graphs,directed or not: the search table of the shortest path \
can be displayed, the minimum distance between two vertices and \
the corresponding path are stored in macros. This packages \
depends on simplekv."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.13svn64580"

RPM_NAME = "texlive-dijkstra-2023.201.0.0.13svn64580-52.1.noarch.rpm"
RPM_HASH = "eeb1041c56ccc44d0005ac1bae151dafe2f2dba611f48a24f6546e7e1b204063cfa348d05e6b727969c4a1e9ad4fe3618e432b39ad532e4becfff7e6f5e5b7aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dijkstra.sty \
texlive-dijkstra"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-simplekv.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
