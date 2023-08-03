SUMMARY = "Draw process flow diagrams in chemical engineering"
DESCRIPTION = "This package provides TikZ shapes to represent commonly \
encountered unit operations for depiction in process flow \
diagrams (PFDs) and, to a lesser extent, process and \
instrumentation diagrams (PIDs). The package was designed with \
undergraduate chemical engineering students and faculty in \
mind, and the number of units provided should cover--in \
Turton's estimate--about 90 percent of all fluid processing \
operations."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn60089"

RPM_NAME = "texlive-pfdicons-2023.209.1.0asvn60089-52.1.noarch.rpm"
RPM_HASH = "623082d6a27655ef3f6c709b525e5fa0f0c600553aaf88794b6595124c0c504af01095f90ff7e2d57c7dd2818b822a78f229e9146e2ebadf1e43e665133be2be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pfdicons.sty \
texlive-pfdicons"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
