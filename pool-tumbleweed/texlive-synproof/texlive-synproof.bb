SUMMARY = "Easy drawing of syntactic proofs"
DESCRIPTION = "The package provides a set of macros based on PSTricks that \
will enable you to draw syntactic proofs easily (inspired by \
the Gamut books). Very few commands are needed, however fine \
tuning of the various parameters (dimensions) can still be \
achieved through 'key=value' pairs."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-synproof-2023.209.1.0svn15878-58.1.noarch.rpm"
RPM_HASH = "56e21506eb952520027615b68f2a578156d8d12d2a043db37c37a4f6762f412dcd2eae9e957eed907e50bd7f928be22f5dfc0fbd092700883fc05710fe699007"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-synproof.sty \
texlive-synproof"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-keyval.sty \
tex-pst-node.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
