SUMMARY = "LaTeX package for TikZ based drawing of military symbols as per NATO APP-6(C)"
DESCRIPTION = "The package offers commands to draw military symbols as per \
NATO APP-6(C) https://www.awl.edu.pl/images/en/APP_6_C.pdf. It \
has a set of commands for drawing all symbols found in the \
document up to the control measures, as well as support for \
custom non-standard symbols. Control measures are planned to be \
included in a future release."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn54361"

RPM_NAME = "texlive-milsymb-2023.209.1.02svn54361-55.1.noarch.rpm"
RPM_HASH = "86bd3339e01a6165fd4bda546d7e0f73f879df675f8afbb07141feb5d0a0895db442cbad6c5149a1992f2b76e36ec3e4624f7ccf3a4e7a2712a6c1bcfbbadf09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-milsymb.sty \
texlive-milsymb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-acronym.sty \
tex-amssymb.sty \
tex-arevmath.sty \
tex-fix-cm.sty \
tex-lmodern.sty \
tex-marvosym.sty \
tex-textcomp.sty \
tex-tikz.sty \
tex-xifthen.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
