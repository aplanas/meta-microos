SUMMARY = "Create graphs within LaTeX using the dot2tex tool"
DESCRIPTION = "The dot2texi package allows you to embed graphs in the DOT \
graph description language in your LaTeX documents. The dot2tex \
tool is used to invoke Graphviz for graph layout, and to \
transform the output from Graphviz to LaTeX code. The generated \
code relies on the TikZ and PGF package or the PSTricks \
package. The process is automated if shell escape is enabled."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.0svn26237"

RPM_NAME = "texlive-dot2texi-2023.209.3.0svn26237-53.1.noarch.rpm"
RPM_HASH = "81d9ade8f2d2f898761114cc30cc5def9f912f8d7ec5e691d6d7fba27e22ca400e00c8190cd1600d0010548f0ecbede1e9c173f2a651ce02809819d67f2a1960"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dot2texi.sty \
texlive-dot2texi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-moreverb.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
