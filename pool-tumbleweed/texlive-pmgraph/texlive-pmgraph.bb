SUMMARY = "'Poor man's' graphics"
DESCRIPTION = "A set of extensions to LaTeX picture environment, including a \
wider range of vectors, and a lot more box frame styles."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-pmgraph-2023.209.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "225e132e090beebaa386c9c3c3cf8e35ec17ddf4d307ec237f8b32b759e0cc6f8dd82738044ac57fca66c02b079d83e8345363b001f332e4b8aa883899253652"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pmgraph.sty \
texlive-pmgraph"

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
