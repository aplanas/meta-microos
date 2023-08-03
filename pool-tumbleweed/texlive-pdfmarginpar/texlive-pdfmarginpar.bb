SUMMARY = "Generate marginpar-equivalent PDF annotations"
DESCRIPTION = "The package provides the \\pdfmarginpar command which is similar \
in spirit to \\marginpar. However, it creates PDF annotations \
which may be viewed with Adobe Reader in place of marginal \
texts. Small icons indicate the in-text position where the \
message originates, popups provide the messages themselves. \
Thus bugfixes and other such communications are clearly visible \
together when viewing the document, while the document itself \
is not obscured."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.92svn23492"

RPM_NAME = "texlive-pdfmarginpar-2023.209.0.0.92svn23492-52.1.noarch.rpm"
RPM_HASH = "5d76602c5f33bf5ac9ba389f9d075e75cc0f92917a61e01b6818cac6d7ead52dae7f616fa7d62c76d24fe0056bb772ee2dd72ec8715057434ad6a4af1d7287dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfmarginpar.sty \
texlive-pdfmarginpar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
