SUMMARY = "Typeset maps and blocks according to the Information Mapping(r) method"
DESCRIPTION = "The Information Mapping(r) method provides a methodology for \
structuring and presenting information. It claims to be useful \
for readers who are more concerned about finding the right \
information than reading the document as a whole. Thus short, \
highly structured, and context free pieces of information are \
used. A LaTeX style and a LaTeX class are provided. The style \
contains definitions to typeset maps and blocks according to \
the Information Mapping(r) method. The class provides all \
definitions to typeset a whole document."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn44863"

RPM_NAME = "texlive-limap-2023.209.2.2svn44863-55.1.noarch.rpm"
RPM_HASH = "4e593390d351694138caaf07627e611e1d4c66b6a8820c7c36b10e3a228d29e2bce27977abeb7be95ca30513d9137395802d9e3248862189b68e37c12c769f94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-limap.cls \
tex-limap.sty \
texlive-limap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-booktabs.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-longtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
