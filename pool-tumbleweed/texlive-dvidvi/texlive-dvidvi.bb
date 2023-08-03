SUMMARY = "Convert one DVI file into another"
DESCRIPTION = "The output DVI file's contents are specified by page selection \
commands; series of pages and page number ranges may be \
specified, as well as inclusions and exclusions."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65952"

RPM_NAME = "texlive-dvidvi-2023.209.svn65952-54.1.noarch.rpm"
RPM_HASH = "5b7472d6cd3a72ab4dc904fdf5ccbed09255b692192965ae957c9fd7c7de64aec0dd1d855b5263421aa62eca157603e25830dfc247712ffea8ba567e6fca9671"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dvidvi.1 \
texlive-dvidvi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-dvidvi-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
