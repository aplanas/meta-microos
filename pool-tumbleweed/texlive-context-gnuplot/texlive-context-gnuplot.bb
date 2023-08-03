SUMMARY = "Inclusion of Gnuplot graphs in ConTeXt"
DESCRIPTION = "Enables simple creation and inclusion of graphs with Gnuplot. \
The package writes a script into temporary file, runs Gnuplot \
and includes the resulting graphic directly into the document. \
See the ConTeXt Garden package page for further details."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-gnuplot-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "41f47e4b9e49c259f53284e44a50e2deb06d6edc4aaffd0508f61b7c8b902d8d37d77ffa10f0e2ee23bc6df69c1c77f28c903237cf9c76d87fe8ec034160141f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-gnuplot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
