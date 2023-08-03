SUMMARY = "Draw graph-theory graphs"
DESCRIPTION = "The package is designed to create graph diagrams as simply as \
possible, using TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn57484"

RPM_NAME = "texlive-tkz-graph-2023.209.2.0svn57484-53.1.noarch.rpm"
RPM_HASH = "0acb533db129ae1f3d0e5559b43cb21686f3e3cf297611974e943b07e5e007f3d0d3211c672ec34351e23eceb7a6577a981d5256790a28162bc95751a7efe579"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tkz-graph.sty \
texlive-tkz-graph"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
tex-ifthen.sty \
tex-tikz.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
