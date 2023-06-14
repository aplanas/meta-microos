SUMMARY = "A simple way to create dynamic blocks for Beamer"
DESCRIPTION = "The package provides full customisation of the aspect and \
dimensions of blocks inside a presentation."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2bsvn35193"

RPM_NAME = "texlive-dynblocks-2023.201.0.0.2bsvn35193-53.1.noarch.rpm"
RPM_HASH = "b49583f3c29bb306931dfa789b9cdc089d193788fc5e3779374277ef14ce25cd9cedd1f3ad64d569ead8801ae8404c6408e96a46a7a2e2436509925f5b61d14b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dynblocks.sty \
texlive-dynblocks"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
