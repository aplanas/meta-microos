SUMMARY = "Typesetting git changelogs"
DESCRIPTION = "This package allows git change log history to be incorporated \
into LaTeX documents; the log data is obtained from the git \
distributed version control system. The current release \
(0.0.beta) is a proof-of-concept release to allow users an \
early evaluation and to attract ideas and support. Requests and \
suggestions, as well as code contributions are welcome."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.betasvn38932"

RPM_NAME = "texlive-gitlog-2023.209.0.0.0.betasvn38932-54.2.noarch.rpm"
RPM_HASH = "a6a4e7ce82aca162cd70b32d5572d142c30ca94ef12051c3ed87eae01652adf229b1bd20397324ac30cf20791f552ff852366382473ae66a2378159de0c67c2b"
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
