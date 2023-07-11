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

PV = "2023.208.1.0.1svn58896"

RPM_NAME = "texlive-mahjong-2023.208.1.0.1svn58896-53.1.noarch.rpm"
RPM_HASH = "237febafc2a4640345e3fd1e506a6c82e45e043bb1ef72ed2beb6f91231ed9d9384612244a8be5f05f02d5249eabf5fe94a068f0a34334fe56cb52002d31369b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mahjong.sty \
texlive-mahjong"

RDEPENDS:${PN} += "/usr/bin/sh \
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
