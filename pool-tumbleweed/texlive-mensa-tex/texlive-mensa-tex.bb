SUMMARY = "Typeset simple school cafeteria menus"
DESCRIPTION = "This package provides a flexible LaTeX2e class for typesetting \
school cafeteria menus consisting of two lunches (with \
dessert), and dinner. It supports two different layouts: The \
first layout is optimized for printing the menu on A4 paper. \
The second layout is optimized for smartphone screens and uses \
one (A6 sized) page per day. Supported localizations are \
English (GB/US) and German. A way of defining additional \
localizations is described in the documentation. The package \
requires array, colortbl, datetime2, datetime2-calc, geometry, \
graphicx, lmodern, textcomp, and xcolor."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn45997"

RPM_NAME = "texlive-mensa-tex-2023.208.svn45997-53.1.noarch.rpm"
RPM_HASH = "65f7d597b1f5367afded872d391a1622b3bd1333abcaf439af0a69fbd6fa2dbd487880e59af3b9650f98a999b7e2a98f840b328afeadac8201e7aba1d1f188e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mensa-tex.cls \
texlive-mensa-tex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-article.cls \
tex-datetime2-calc.sty \
tex-datetime2.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-lmodern.sty \
tex-textcomp.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
