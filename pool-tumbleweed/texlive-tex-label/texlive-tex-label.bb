SUMMARY = "Place a classification on each page of a document"
DESCRIPTION = "Enables the user to place a 'classification' label on each \
page, at the bottom to the right of the page number"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn16372"

RPM_NAME = "texlive-tex-label-2023.209.svn16372-55.1.noarch.rpm"
RPM_HASH = "acb251d12f91aec691138e1b4b54984b290d38ab5a2e93166754e6519bde3788ca073a0c18b0cc6946b4d1e07c2d82441f42421efe0e4d67f5b2a1945373b42f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tex-label.sty \
texlive-tex-label"

RDEPENDS:${PN} += "/usr/bin/sh \
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
