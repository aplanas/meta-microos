SUMMARY = "Flexible page geometry with marginalia"
DESCRIPTION = "The package flexipage allows easy page layout if marginalia is \
required. Mid document changes are possible such as: new \
marginal width, full width text, and landscape text without \
marginal. Partners well with the package sidenotesplus. The \
package also aids the layout for book printing, allowing for \
binding corrections and adding page bleed, if required."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn64572"

RPM_NAME = "texlive-flexipage-2023.209.1.01svn64572-53.1.noarch.rpm"
RPM_HASH = "cdc47c608b5a2d2af405b5243647a214990f389cd686436f59497de01302593bd110acb372056d31edb498bd5759b8db824908a24f69e3b7aaa27677b79b8ab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-flexipage.sty \
texlive-flexipage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-eso-pic.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-fp.sty \
tex-graphics.sty \
tex-ifoddpage.sty \
tex-l3keys2e.sty \
tex-mparhack.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
