SUMMARY = "TikZ styles to typeset graphs of program memory"
DESCRIPTION = "This package defines some TikZ styles and adds anchors to \
existing styles that ease the declaration of 'memory graphs'. \
It is intended for graphs that represent the memory of a \
computer program during its execution."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1.1svn49631"

RPM_NAME = "texlive-memorygraphs-2023.208.0.0.1.1svn49631-53.1.noarch.rpm"
RPM_HASH = "efd909097c1b12b36825d7eb876bb91ab92eb84b646770315d98c12d52b93c360f3e91581b70e15a07a030d6c4bff4d4af8cb171947d5294ba9680cadf67b159"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-memorygraphs.sty \
texlive-memorygraphs"

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
