SUMMARY = "Create Harvey Balls using TikZ"
DESCRIPTION = "The package provides 5 commands (giving symbols that indicate \
values from 'none' to 'full')."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn32003"

RPM_NAME = "texlive-harveyballs-2023.201.1.1svn32003-53.1.noarch.rpm"
RPM_HASH = "6785ae4546b9a8e81c7b40df81090c9248964b07e33fc1bcfb9f7d4319afaecb51e0d80cb00bb541429e2fe32390f829c8b4dd6f9c9cd5a615cc8a2fac4cc2e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-harveyballs.sty \
texlive-harveyballs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
