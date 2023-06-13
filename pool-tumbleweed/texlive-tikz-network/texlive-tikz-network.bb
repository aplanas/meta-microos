SUMMARY = "Draw networks with TikZ"
DESCRIPTION = "This package allows the creation of images of complex networks \
that are seamlessly integrated into the underlying LaTeX files. \
The package requires datatool, etex, graphicx, tikz, \
trimspaces, xifthen, and xkeyval."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn51884"

RPM_NAME = "texlive-tikz-network-2023.201.1.1svn51884-52.1.noarch.rpm"
RPM_HASH = "b519b348bab4f0732be5bbee60e2a7b8849f455d82ba102dc2b888d0a6139821b33cea10577280a55ce5791f9f6e1a168401eecefde11f9703aedb726f459a3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikz-network.sty) \
texlive-tikz-network"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(datatool.sty) \
tex(etex.sty) \
tex(graphicx.sty) \
tex(tikz.sty) \
tex(trimspaces.sty) \
tex(xifthen.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
