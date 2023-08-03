SUMMARY = "Miscellaneous mathematical macros"
DESCRIPTION = "The package provides some mathematical macros to typeset: \
mathematical constants e, i, p in upright shape (automatically) \
as recommended by ISO 80000-2, vectors with beautiful arrows \
and adjusted norm, some standard operator names, improved \
spacings in mathematical formulas, systems of equations and \
small matrices, displaymath in double columns for long \
calculations."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7svn66391"

RPM_NAME = "texlive-mismath-2023.209.2.7svn66391-55.1.noarch.rpm"
RPM_HASH = "403470db155e15bc68a3164931676654ac25e8f250d69ff156009e9d8faba11a7c6ddfb06f201da10143edbfe5825e98a5915294d7b178c692d84327f945e2a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mismath.sty \
texlive-mismath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-esvect.sty \
tex-fontenc.sty \
tex-ibrackets.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-mathtools.sty \
tex-xparse.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
