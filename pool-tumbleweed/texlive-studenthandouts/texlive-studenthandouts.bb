SUMMARY = "Management and styling of student handout projects"
DESCRIPTION = "This package can be used to generate a single master document \
that contains a set of individual student handouts. The package \
has two main functions. First, it provides a simple framework \
for organizing handout source code, and supplies a set of \
import management tools for selectively importing a subset of \
the handouts into the master document. Selective import is \
convenient when compilation of all of the handouts is \
unnecessary, for example when working on a new handout. As a \
secondary feature, the package defines a basic visual style for \
handouts. This style can be easily changed."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn43516"

RPM_NAME = "texlive-studenthandouts-2023.209.1.0svn43516-58.1.noarch.rpm"
RPM_HASH = "ebb28c7916fc4c290d3b9999d8ea82b08906fa0ee14142445c10ae14814c2125b0cd1b6f00941f19a8ac4211b2c2f038e50a9efec1e61cdc7d9ef7aecf7cf67f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-studenthandouts.sty \
texlive-studenthandouts"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-changepage.sty \
tex-fancyhdr.sty \
tex-fmtcount.sty \
tex-geometry.sty \
tex-ifthen.sty \
tex-tocloft.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
