SUMMARY = "A Finnish version of plain.bst"
DESCRIPTION = "The finbib package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-finbib-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "26f7959e5c06413c9c68051b1b279177567e0d3cb0ac87e022e8c4ebf5989c5e8462819cb04d6e4b9af59d59028146695604868e42b9b5b12056df946e5102c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-finbib"

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
