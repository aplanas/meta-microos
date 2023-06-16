SUMMARY = "Typesetting git changelogs"
DESCRIPTION = "This package allows git change log history to be incorporated \
into LaTeX documents; the log data is obtained from the git \
distributed version control system. The current release \
(0.0.beta) is a proof-of-concept release to allow users an \
early evaluation and to attract ideas and support. Requests and \
suggestions, as well as code contributions are welcome."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.betasvn38932"

RPM_NAME = "texlive-gitlog-2023.201.0.0.0.betasvn38932-53.1.noarch.rpm"
RPM_HASH = "e3c31b71c10c337e9dc96a0b98e6b865e1d959d6ddd0038bf0a22e550783336fa952c54c0e4085d064a0b94fcc9ced28888c6bf3603ded6e77c428f28c9834f5"
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
