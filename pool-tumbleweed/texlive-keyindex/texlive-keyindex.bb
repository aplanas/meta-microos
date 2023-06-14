SUMMARY = "Index entries by key lookup"
DESCRIPTION = "The package provides functionality for producing an index \
without directly entering index entries into the text using the \
\\index command, but instead by looking up short keys and \
printing a predefined string in the main text and adding a \
corresponding index entry. The standard use case is the \
production of an index of names."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn50828"

RPM_NAME = "texlive-keyindex-2023.201.1.0svn50828-55.1.noarch.rpm"
RPM_HASH = "b93dad9a909641f174a2a6f47ab69e9dc2670487c5d320395e2dab8838635341152d1702acbe14cf18c51b0923626036ca3b0cfc3c674b4f716a98354c0ccf2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-keyindex.sty \
texlive-keyindex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
