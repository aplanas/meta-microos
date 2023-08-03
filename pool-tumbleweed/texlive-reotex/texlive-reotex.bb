SUMMARY = "Draw Reo Channels and Circuits"
DESCRIPTION = "The package defines macros and other utilities to design Reo \
Circuits. The package requires PGF/TikZ support."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn34924"

RPM_NAME = "texlive-reotex-2023.209.1.1svn34924-54.1.noarch.rpm"
RPM_HASH = "879f55550d3ccd80a7d69c8ce290a0fca06058d2a598c9d402c98c85a15f3c81010f05134d3b416d44d706f548f15433f2ff75d55de879fe9cd5a44f71048a4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-reotex.sty \
texlive-reotex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
