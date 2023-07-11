SUMMARY = "Write graphviz (dot+neato) inline in LaTeX documents"
DESCRIPTION = "The package allows inline use of graphviz code, in a LaTeX \
document."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.94svn31517"

RPM_NAME = "texlive-graphviz-2023.201.0.0.94svn31517-53.2.noarch.rpm"
RPM_HASH = "16c1c14f8e53bff4d5b83b0a0991dac266eaa3a7168b303832c3841d8acc50cce69225216a151bf65248804f9a21b89001e876dffe53e7e200d5b89da7c8b0ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-graphviz.sty \
texlive-graphviz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-psfrag.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
