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

PV = "2023.201.svn45997"

RPM_NAME = "texlive-mensa-tex-2023.201.svn45997-52.1.noarch.rpm"
RPM_HASH = "674974541925764c16464f33e21e18893c984a1b963647bae1fc8877bc211e43a27be29bfafdd3fd60800d4e836a55d9f4937e1d84809b6cef612ee42558f684"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mensa-tex.cls \
texlive-mensa-tex"

RDEPENDS:${PN} += "/bin/sh \
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
