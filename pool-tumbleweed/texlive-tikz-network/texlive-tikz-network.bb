SUMMARY = "Draw networks with TikZ"
DESCRIPTION = "This package allows the creation of images of complex networks \
that are seamlessly integrated into the underlying LaTeX files. \
The package requires datatool, etex, graphicx, tikz, \
trimspaces, xifthen, and xkeyval."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn51884"

RPM_NAME = "texlive-tikz-network-2023.209.1.1svn51884-53.1.noarch.rpm"
RPM_HASH = "fff9ee5ebc408a13698975e428782243a55797642264312344fee0079331a358f697338c14cd8987f18f192b7602ec550ce54ac6822cd8f0e863db5699dd3f79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-network.sty \
texlive-tikz-network"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-datatool.sty \
tex-etex.sty \
tex-graphicx.sty \
tex-tikz.sty \
tex-trimspaces.sty \
tex-xifthen.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
