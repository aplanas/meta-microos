SUMMARY = "Typesetting git changelogs"
DESCRIPTION = "This package allows git change log history to be incorporated \
into LaTeX documents; the log data is obtained from the git \
distributed version control system. The current release \
(0.0.beta) is a proof-of-concept release to allow users an \
early evaluation and to attract ideas and support. Requests and \
suggestions, as well as code contributions are welcome."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.betasvn38932"

RPM_NAME = "texlive-gitlog-2023.201.0.0.0.betasvn38932-53.2.noarch.rpm"
RPM_HASH = "cc894d285c00e9f35f10a7206b145f8d611f49318cfba164b93a3d09fc464938a1fd5a3c9a86cb72d1ba616004bddf18c04bf24c8240515898f8db5cb2cbb575"
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
