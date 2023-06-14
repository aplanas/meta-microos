SUMMARY = "Place a classification on each page of a document"
DESCRIPTION = "Enables the user to place a 'classification' label on each \
page, at the bottom to the right of the page number"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn16372"

RPM_NAME = "texlive-tex-label-2023.201.svn16372-54.1.noarch.rpm"
RPM_HASH = "4d65063053f3e07d9ede12508024aaa5b758ed23600af0afc663f4e27450e1e790b10a96b769d7951946470396b4edd41e28ef54fe82667ab6401f73b1b5a08a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tex-label.sty \
texlive-tex-label"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-fancyhdr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
