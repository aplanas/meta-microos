SUMMARY = "Something like Koma-Script typearea"
DESCRIPTION = "The module provides a command that calculates the page layout \
as the LaTeX package typearea does."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-typearea-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "a0f4ff12c1dfefbec2be7cf4ba6ad73563988a762b0d1eb1ec1998b295175d61faaf01f1dedf85af24e32a609ecf20b49542b1b51564b167c742204e82375470"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-typearea.tex \
texlive-context-typearea"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
