SUMMARY = "A package for typesetting chess problem diagrams"
DESCRIPTION = "This package provides macros to typeset chess problem diagrams \
including fairy chess problems (mostly using rotated images of \
pieces) and other boards."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.21svn63708"

RPM_NAME = "texlive-chess-problem-diagrams-2023.209.1.21svn63708-54.1.noarch.rpm"
RPM_HASH = "21763ed39056aaa2e95f8ad922fdc72160e5e55f6a211e31bb119b52d218e8443fe66fb1b9cbc390cc3909b4ba3ffa4667ea9dfb867650f8e06eb6a5cc035972"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cpdparse.sty \
tex-diagram.sty \
texlive-chess-problem-diagrams"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
