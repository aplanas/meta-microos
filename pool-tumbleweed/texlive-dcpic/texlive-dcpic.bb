SUMMARY = "Commutative diagrams in a LaTeX and TeX documents"
DESCRIPTION = "DCpic is a package for typesetting Commutative Diagrams within \
a LaTeX and TeX documents. Its distinguishing features are: a \
powerful graphical engine, the PiCTeX package; an easy \
specification syntax in which a commutative diagram is \
described in terms of its objects and its arrows (morphism), \
positioned in a Cartesian coordinate system."
LICENSE = "LPPL-1.0"

PV = "2023.201.5.0.0svn30206"

RPM_NAME = "texlive-dcpic-2023.201.5.0.0svn30206-52.1.noarch.rpm"
RPM_HASH = "7acdaa324b47fe57c00bb0e896aa1589510113bd654fb7bceff8edb209164eb7531d6a55ec13a2661b1242f1e01146b0f9fc36dcb9689365ab40b2e4113fa57e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dcpic.sty \
tex-europroc.cls \
texlive-dcpic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
