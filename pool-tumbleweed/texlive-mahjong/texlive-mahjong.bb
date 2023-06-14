SUMMARY = "Typeset Mahjong Tiles using MPSZ Notation"
DESCRIPTION = "The mahjong package provides a LaTeX2e and LaTeX3 interface for \
typesetting mahjong tiles using an extended version of MPSZ \
algebraic notation. Features include spaces, rotated, blank, \
and concealed tiles, as well as red fives. The size of the \
mahjong tiles can be controlled using a package option and an \
optional argument of \\mahjong. It is primarily aimed at Riichi \
(aka. Japanese) Mahjong but can be used to typeset any style of \
mahjong."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn58896"

RPM_NAME = "texlive-mahjong-2023.201.1.0.1svn58896-52.1.noarch.rpm"
RPM_HASH = "ac2550a4a4ed0b69ad6720e72db9b576bb36b0da42cf466e27e85359218f6ce9e1be60780be591d8927f891d59d1693c12b3b2a61a83364c179c7ba4e97a8cb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mahjong.sty \
texlive-mahjong"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-graphicx.sty \
tex-l3keys2e.sty \
tex-stackengine.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
