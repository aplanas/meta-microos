SUMMARY = "Printing addresses on envelopes"
DESCRIPTION = "A simple package, that prints both 'from' and 'to' addresses."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-envbig-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "40e7bb7fe2466bfae5eb0311d3da594502ec07d17d298dc83818e45c778c5f95c79b2d1d0dfbfacd997121b3782ce71da418114bcee1a021201542d558b71754"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-envbig.sty \
texlive-envbig"

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
