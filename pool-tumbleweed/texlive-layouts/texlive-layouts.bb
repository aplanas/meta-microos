SUMMARY = "Display various elements of a document's layout"
DESCRIPTION = "Display information about a document, including: text \
positioning on a page; disposition of floats; layout of \
paragraphs, lists, footnotes, table of contents, and sectional \
headings; font boxes. Facilities are provided for a document \
designer to experiment with the layout parameters."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.6dsvn42428"

RPM_NAME = "texlive-layouts-2023.209.2.6dsvn42428-55.1.noarch.rpm"
RPM_HASH = "6d71b775c9742a0509cacc462ce61a452d4c545ba4cb4ed4069ad240daaa94636f5999331fbd45b204de353e893395b96c4e5628371158f04b080fe191d016b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-layouts.sty \
texlive-layouts"

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
