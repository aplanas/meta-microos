SUMMARY = "Write graphviz (dot+neato) inline in LaTeX documents"
DESCRIPTION = "The package allows inline use of graphviz code, in a LaTeX \
document."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.94svn31517"

RPM_NAME = "texlive-graphviz-2023.209.0.0.94svn31517-54.2.noarch.rpm"
RPM_HASH = "37c3878f15631c94fcaa4fba88399f28fb2ca1257726522cffda6fa85717c9faa4bcc521ec8fdb05eb558ca7d22af3627e417b3786068b3caa96ec612f193c94"
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
