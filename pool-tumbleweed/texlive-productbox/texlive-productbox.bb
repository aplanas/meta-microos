SUMMARY = "Typeset a three-dimensional product box"
DESCRIPTION = "The package enables typesetting of a three-dimensional product \
box. This product box can be rendered as it is standing on a \
surface and some light is shed onto it. Alternatively it can be \
typeset as a wireframe to be cut out and glued together. This \
will lead to a physical product box. The package requires pgf \
and TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn20886"

RPM_NAME = "texlive-productbox-2023.209.1.1svn20886-53.1.noarch.rpm"
RPM_HASH = "2279ccbfc570a7043a8b2d8eff1a6d7fb27826f43a3e0649a2f7a68fdedf23cfc82fc198c360abd955777e6344631e30f6a843d335ba0c23e96768fb7b911f57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-productbox.sty \
texlive-productbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
