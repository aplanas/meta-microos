SUMMARY = "Typeset (univariate) polynomials"
DESCRIPTION = "The package offers an easy way to write (univariate) \
polynomials and rational functions. It defines two commands, \
one for polynomials \\polynomial{coeffs} and one for rational \
functions \\polynomialfrac{Numerator}{Denominator}. Both \
commands take lists of coefficients as arguments, and offer \
limited optional behaviour."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-polynomial-2023.209.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "63507d1b0de9acd85e34be5d0138fd902efee4d5c0d57b981cda145d461d9a4f70c3b36d242a74ea2117a43b49fb3d5c59f3fc68a2c00cb3e354695a60119a52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-polynomial.sty \
texlive-polynomial"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
