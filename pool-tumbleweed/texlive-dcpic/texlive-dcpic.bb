SUMMARY = "Commutative diagrams in a LaTeX and TeX documents"
DESCRIPTION = "DCpic is a package for typesetting Commutative Diagrams within \
a LaTeX and TeX documents. Its distinguishing features are: a \
powerful graphical engine, the PiCTeX package; an easy \
specification syntax in which a commutative diagram is \
described in terms of its objects and its arrows (morphism), \
positioned in a Cartesian coordinate system."
LICENSE = "LPPL-1.0"

PV = "2023.209.5.0.0svn30206"

RPM_NAME = "texlive-dcpic-2023.209.5.0.0svn30206-53.1.noarch.rpm"
RPM_HASH = "e08033f7d725ee403bc21b95bbd43e3edb62f210956bbdfc7e6d0c7324477d5ecdead6058710c95d7889f379a4ab1e6dfda7aad6f76b2b680c2c17d6c150f086"
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
