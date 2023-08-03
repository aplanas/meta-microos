SUMMARY = "Highly customised stacking of objects, insets, baseline changes, etcetera"
DESCRIPTION = "The package provides a versatile way to stack objects \
vertically in a variety of customizable ways. A number of \
useful macros are provided, all of which make use of the \
stackengine core."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.11svn60019"

RPM_NAME = "texlive-stackengine-2023.209.4.11svn60019-58.1.noarch.rpm"
RPM_HASH = "63a517c147c277e5355920a34556264b8140628d406f94eb059de4730405903687f7ae20a967ab8daee5567184a23464a61979e887d19a83ffd91187c2f85be9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-stackengine.sty \
texlive-stackengine"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-etoolbox.sty \
tex-listofitems.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-listofitems \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
