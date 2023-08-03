SUMMARY = "Measure restriction symbol in LaTeX"
DESCRIPTION = "This package provides a simple macro \\resmes that prints the \
measure restriction symbol."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn65375"

RPM_NAME = "texlive-resmes-2023.209.1.0svn65375-54.1.noarch.rpm"
RPM_HASH = "4060472f97a992518b3a39d80e6679a881d4da90d4cc99cf7247e8d75e1dc6f217f60dd5349189a0aac15be10ffe787387ea1fde58ba13500aa96f3375399f0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-resmes.sty \
texlive-resmes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
