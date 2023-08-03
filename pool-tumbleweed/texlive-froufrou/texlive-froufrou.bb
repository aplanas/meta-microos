SUMMARY = "Fancy section separators"
DESCRIPTION = "This package provides fancy separators, which are visual cues \
that indicate a change of subject or context without actually \
starting a new chapter or section."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4.0svn59103"

RPM_NAME = "texlive-froufrou-2023.209.1.4.0svn59103-53.1.noarch.rpm"
RPM_HASH = "5deff6eb0bff204863779d2efd5f626d3a1ef7305757a4cd01a2267d6b5d7fb90e2a6ab15e66c199626e58abb875e69d7ca7dd027f6295099347227a8a29bbd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-froufrou.sty \
texlive-froufrou"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expl3.sty \
tex-fourier-orns.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
