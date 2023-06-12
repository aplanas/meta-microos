SUMMARY = "LaTeX package for TikZ based drawing of military symbols as per NATO APP-6(C)"
DESCRIPTION = "The package offers commands to draw military symbols as per \
NATO APP-6(C) https://www.awl.edu.pl/images/en/APP_6_C.pdf. It \
has a set of commands for drawing all symbols found in the \
document up to the control measures, as well as support for \
custom non-standard symbols. Control measures are planned to be \
included in a future release."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn54361"

RPM_NAME = "texlive-milsymb-2023.201.1.02svn54361-54.1.noarch.rpm"
RPM_HASH = "8986947dc035b4781d016e4101735ffffe7a13d93e2c21fbe2f7219d63779eae21f0e556154ffae6794159c05e48f6f7470095ea97e1154a305ae9a257b7dc52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(milsymb.sty) \
texlive-milsymb"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(acronym.sty) \
tex(amssymb.sty) \
tex(arevmath.sty) \
tex(fix-cm.sty) \
tex(lmodern.sty) \
tex(marvosym.sty) \
tex(textcomp.sty) \
tex(tikz.sty) \
tex(xifthen.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
