SUMMARY = "Draw Reo Channels and Circuits"
DESCRIPTION = "The package defines macros and other utilities to design Reo \
Circuits. The package requires PGF/TikZ support."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn34924"

RPM_NAME = "texlive-reotex-2023.209.1.1svn34924-54.2.noarch.rpm"
RPM_HASH = "38963b65a609d8ce48ad0be984c6406c079b4868e1f5a9e97fdff126afc39271dd12e0eef09860a9e917450751ff34f1f2e6e0b521509529edd093b112305e00"
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
