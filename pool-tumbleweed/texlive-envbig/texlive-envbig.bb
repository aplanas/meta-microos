SUMMARY = "Printing addresses on envelopes"
DESCRIPTION = "A simple package, that prints both 'from' and 'to' addresses."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-envbig-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "1a05a350cd5270597233b9edaf8865bfb287981b2bcb8678030a45b985f7e3e2a390c1b9c8800a5b0fdaedeca87fb1b1689f5feab43e67b2c6fb77df4b26b3bc"
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
