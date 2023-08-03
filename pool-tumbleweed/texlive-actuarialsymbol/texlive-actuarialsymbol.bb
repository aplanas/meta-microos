SUMMARY = "Actuarial symbols of life contingencies and financial mathematics"
DESCRIPTION = "This package provides commands to compose actuarial symbols of \
life contingencies and financial mathematics characterized by \
subscripts and superscripts on both sides of a principal \
symbol. The package also features commands to easily and \
consistently position precedence numbers above or below \
statuses in symbols for multiple lives contracts. Since the \
actuarial notation can get quite involved, the package defines \
a number of shortcut macros to ease entry of the most common \
elements. Appendix A of the package documentation lists the \
commands to typeset a large selection of symbols of life \
contingencies. This package requires actuarialangle."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn54080"

RPM_NAME = "texlive-actuarialsymbol-2023.209.1.1svn54080-55.1.noarch.rpm"
RPM_HASH = "8fa63125b597295149cf96449cdb2033b9095ef1cb57cf5a50853749e73dfcee0c1ed9ee198e2b0c1f0f149aec72dfb52f31305f7d030266fbd471aad3fc16b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-actuarialsymbol.sty \
texlive-actuarialsymbol"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-actuarialangle.sty \
tex-amsmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
