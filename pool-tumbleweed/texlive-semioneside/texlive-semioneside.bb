SUMMARY = "Put only special contents on left-hand pages in two sided layout"
DESCRIPTION = "This package supports the preparation of semi one sided \
documents. That is, two sided documents, where all text is \
output on right-hand pages--as in a one-sided documents--and \
only special contents are output on left-hand pages on user \
request, e.g., floating objects."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.41svn15878"

RPM_NAME = "texlive-semioneside-2023.201.0.0.41svn15878-53.1.noarch.rpm"
RPM_HASH = "682f60e90bc835af36f6aef61085a5edc0787e74cff7fb6abd7aff1fb2bf9f4672be9040d18a135ec094ca4a52919b1dd45aa74849c7ee122f2a25f370593ead"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-semioneside.sty \
texlive-semioneside"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
