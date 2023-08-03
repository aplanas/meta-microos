SUMMARY = "Minipage spanning a complete page"
DESCRIPTION = "This package provides the environment fullminipage, which \
generates a minipage spanning a new, complete page with page \
style empty. The environment provides options to set margins \
around the minipage and configure the background."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.1.1svn34545"

RPM_NAME = "texlive-fullminipage-2023.209.0.0.1.1svn34545-53.1.noarch.rpm"
RPM_HASH = "d9cc1437d065522a4bfa6cdcbb1d678592d92e80fadc3c108a51d3cd1919b862b65430e9e124d70a9d013d7658f4773c967a627c53d4766bb89b77dc4bab91b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fullminipage.sty \
texlive-fullminipage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
