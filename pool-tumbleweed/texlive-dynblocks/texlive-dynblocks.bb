SUMMARY = "A simple way to create dynamic blocks for Beamer"
DESCRIPTION = "The package provides full customisation of the aspect and \
dimensions of blocks inside a presentation."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2bsvn35193"

RPM_NAME = "texlive-dynblocks-2023.209.0.0.2bsvn35193-54.2.noarch.rpm"
RPM_HASH = "b4d0128f6e2fe2a84e89776b56e5b5b89f8f5a88f03b53ec308e0adfae6209a4ea2ebe8847eaa2f41508bb6d953b850b759dccb6c0bd803479f50d5510ce02c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dynblocks.sty \
texlive-dynblocks"

RDEPENDS:${PN} += "/usr/bin/sh \
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
