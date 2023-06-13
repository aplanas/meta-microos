SUMMARY = "ConTeXt macros for chromatograms"
DESCRIPTION = "The module provides macros for drawing chromatograms."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-chromato-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "f0e473884d35d363e0fc1dfc5afb87a6f5981058a96fa42d2276421ef94b274a2c3012e4945faeae3634d38b01b81bce8feaeb63ffe8fce76de05b2a0ecf88bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(t-chromato.tex) \
texlive-context-chromato"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
