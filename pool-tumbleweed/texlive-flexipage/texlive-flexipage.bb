SUMMARY = "Flexible page geometry with marginalia"
DESCRIPTION = "The package flexipage allows easy page layout if marginalia is \
required. Mid document changes are possible such as: new \
marginal width, full width text, and landscape text without \
marginal. Partners well with the package sidenotesplus. The \
package also aids the layout for book printing, allowing for \
binding corrections and adding page bleed, if required."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn64572"

RPM_NAME = "texlive-flexipage-2023.201.1.01svn64572-52.1.noarch.rpm"
RPM_HASH = "3b0e532c7c247608db630390c980ec34c421724fee421f3c5d44d47f64da083373253856ab003117289d3fe6881bb8bcdaa0bc8e761ac28b2375e71074ea1fb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(flexipage.sty) \
texlive-flexipage"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(eso-pic.sty) \
tex(etoolbox.sty) \
tex(fancyhdr.sty) \
tex(fp.sty) \
tex(graphics.sty) \
tex(ifoddpage.sty) \
tex(l3keys2e.sty) \
tex(mparhack.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
