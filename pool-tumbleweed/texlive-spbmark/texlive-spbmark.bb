SUMMARY = "Customize superscripts and subscripts"
DESCRIPTION = "This package provides three commands \\super, \\sub and \\supersub \
to improve the layout of superscripts and subscripts which can \
be adjusted with respect to relative position and format, and \
can be used in text and math mode."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.42svn64706"

RPM_NAME = "texlive-spbmark-2023.209.1.42svn64706-58.1.noarch.rpm"
RPM_HASH = "735ef1f5bcb9f6e42d9b72471af172d7e2dff8bdcc415a8796baec86ef3e1be4b7cecff1892fb6217e4e3b2307e834a85d67fbec26631f01e111e85cb912a7fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-spbmark.sty \
texlive-spbmark"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
