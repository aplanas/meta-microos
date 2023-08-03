SUMMARY = "Put only special contents on left-hand pages in two sided layout"
DESCRIPTION = "This package supports the preparation of semi one sided \
documents. That is, two sided documents, where all text is \
output on right-hand pages--as in a one-sided documents--and \
only special contents are output on left-hand pages on user \
request, e.g., floating objects."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.41svn15878"

RPM_NAME = "texlive-semioneside-2023.209.0.0.41svn15878-54.1.noarch.rpm"
RPM_HASH = "28d9503775d93753c9cdbe5c3c4ea37c0fe9d936c6194c940a45895e4bf5c8a5b0bdfd4b41177ab08cd34f8fbba1aaa2f69e36077268c47f8510cf97e88f0267"
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
