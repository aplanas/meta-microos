SUMMARY = "A package to help change page layout parameters in LaTeX"
DESCRIPTION = "The package lets you change page layout parameters in small \
steps over a range of values using options. It can set \
\\textwidth appropriately for the main fount, and ensure that \
the text fits inside the printable area of a printer. An \
rmpage-formatted document can be typeset identically without \
rmpage after a single cut and paste operation. Local \
configuration can set defaults: for all documents; and by \
class, by printer, and by paper size. The geometry package is \
better if you want to set page layout parameters to particular \
measurements."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.92svn54080"

RPM_NAME = "texlive-rmpage-2023.209.0.0.92svn54080-54.2.noarch.rpm"
RPM_HASH = "e3f636d3dd4126ccec5efa052c6daf5a7d123fdacb194b494c26fcc713ab28930b55f13d1005820d497b919fc2536730c2c8982e81c7bab89410c22e18ece7f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rmpage.sty \
tex-rmpgen.cfg \
texlive-rmpage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-avant.sty \
tex-beton.sty \
tex-bookman.sty \
tex-chancery.sty \
tex-helvet.sty \
tex-newcent.sty \
tex-palatino.sty \
tex-times.sty \
tex-utopia.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
