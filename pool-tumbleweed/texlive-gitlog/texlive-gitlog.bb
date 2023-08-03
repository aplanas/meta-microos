SUMMARY = "Typesetting git changelogs"
DESCRIPTION = "This package allows git change log history to be incorporated \
into LaTeX documents; the log data is obtained from the git \
distributed version control system. The current release \
(0.0.beta) is a proof-of-concept release to allow users an \
early evaluation and to attract ideas and support. Requests and \
suggestions, as well as code contributions are welcome."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.betasvn38932"

RPM_NAME = "texlive-gitlog-2023.209.0.0.0.betasvn38932-54.1.noarch.rpm"
RPM_HASH = "90b881ead51c519290c77f1dc84718d0c978ca21b8f6779ca8c95376a0e6d288b5e11be9337cac0de7d78ba946e5f498911d9e84485a972e6a401d5ae0db6fe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gitlog.bbx \
tex-gitlog.sty \
texlive-gitlog"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
