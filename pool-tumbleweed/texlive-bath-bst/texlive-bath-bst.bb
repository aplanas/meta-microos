SUMMARY = "Harvard referencing style as recommended by the University of Bath Library"
DESCRIPTION = "This package provides a BibTeX style to format reference lists \
in the Harvard style recommended by the University of Bath \
Library. It should be used in conjunction with natbib for \
citations."
LICENSE = "LPPL-1.0"

PV = "2023.201.6.0svn63398"

RPM_NAME = "texlive-bath-bst-2023.201.6.0svn63398-53.1.noarch.rpm"
RPM_HASH = "4ab0489f5289ca1dc70fe640a3cdee7a87fdf3df63fbbab356dd88026c47de82e9bdb520287e8c3581ac2208cfdb3d20c29c83191d04c116169220a94c661015"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bath-bst"

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
