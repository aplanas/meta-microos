SUMMARY = "Write graphviz (dot+neato) inline in LaTeX documents"
DESCRIPTION = "The package allows inline use of graphviz code, in a LaTeX \
document."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.94svn31517"

RPM_NAME = "texlive-graphviz-2023.209.0.0.94svn31517-54.1.noarch.rpm"
RPM_HASH = "b1046f90ca6fd3ac018d138d73c8e262d2843fb7c092350f1ca7671e5c10bf8d687e76111b0350f010d2417c7c2e90570a2469a98616c68def8cd9d1cc177e79"
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
