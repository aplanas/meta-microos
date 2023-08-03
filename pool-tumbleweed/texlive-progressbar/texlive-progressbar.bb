SUMMARY = "Visualize shares of total amounts in the form of a (progress-)bar"
DESCRIPTION = "This package allows you to easily visualize shares of total \
amounts in the form of a bar. So basically you can convert any \
number between 0 and 1 to a progressbar using the command \
\\progressbar{<number>}. Also a lot of customizations are \
possible, allowing you to create an unique progressbar on your \
own. The package uses TikZ to produce its graphics."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0b_4svn33822"

RPM_NAME = "texlive-progressbar-2023.209.1.0b_4svn33822-53.1.noarch.rpm"
RPM_HASH = "286d8214b093dd021ec0827b8ddfac65aa0be8eaa50c8dfc4419f691200cd272bc1f5cd82ec918d90862f0695c9646d86e9411aa59d1d322b60d489ec10d66e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-progressbar.sty \
texlive-progressbar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-kvoptions.sty \
tex-kvsetkeys.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
