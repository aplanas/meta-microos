SUMMARY = "Use italic and upright greek letters with mathtime"
DESCRIPTION = "This package is an add-on to the MathTime a style to provide \
TeX support for the use of the MathTime(tm) fonts (formerly \
distributed by YandY, Inc.). The MathTime package has uppercase \
Greek letters hardwired to be upright and only upright; this \
package provides a switch to choose between the two kinds of \
Greek uppercase letters."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1+svn17967"

RPM_NAME = "texlive-mtgreek-2023.209.1.1+svn17967-55.1.noarch.rpm"
RPM_HASH = "33ab4c3cfd6aecb42f6c37f9aff07dca8ebd07a858569d0ee7ea8524dd20611f86eaf1aee1633d0184e37e7fe7781b9418a4fa558f25d660a44ffba558791192"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mtgreek.sty \
texlive-mtgreek"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
