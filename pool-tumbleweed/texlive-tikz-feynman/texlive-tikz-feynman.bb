SUMMARY = "Feynman diagrams with TikZ"
DESCRIPTION = "This is a LaTeX package allowing Feynman diagrams to be easily \
generated within LaTeX with minimal user instructions and \
without the need of external programs. It builds upon the TikZ \
package and leverages the graph placement algorithms from TikZ \
in order to automate the placement of many vertices. \
tikz-feynman allows fine-tuned placement of vertices so that \
even complex diagrams can still be generated with ease."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.0svn56615"

RPM_NAME = "texlive-tikz-feynman-2023.201.1.1.0svn56615-52.1.noarch.rpm"
RPM_HASH = "739d5511ca4a16411debe1ae0c090cff91728668bf5ceddef5ff0d6908ba5338bf1787ed60ae04205e6a0a74ec96b3b7a045a7615f13865866bbce32d54c94a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-feynman.sty \
tex-tikzfeynman.keys.code.tex \
tex-tikzlibraryfeynman.code.tex \
texlive-tikz-feynman"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-pgfopts.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgfopts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
