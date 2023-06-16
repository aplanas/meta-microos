SUMMARY = "Create graphs within LaTeX using the dot2tex tool"
DESCRIPTION = "The dot2texi package allows you to embed graphs in the DOT \
graph description language in your LaTeX documents. The dot2tex \
tool is used to invoke Graphviz for graph layout, and to \
transform the output from Graphviz to LaTeX code. The generated \
code relies on the TikZ and PGF package or the PSTricks \
package. The process is automated if shell escape is enabled."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.0svn26237"

RPM_NAME = "texlive-dot2texi-2023.201.3.0svn26237-52.1.noarch.rpm"
RPM_HASH = "f968a3b7d83f7dc8ebfb3a8ebd2412ed76ab9d419efd00add054c8b2eb3d9de82e13ab448c8221422c94f789d573e94ed13ad937ee78199f11ed5e48be055cf4"
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
