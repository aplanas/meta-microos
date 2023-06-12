SUMMARY = "Typeset (univariate) polynomials"
DESCRIPTION = "The package offers an easy way to write (univariate) \
polynomials and rational functions. It defines two commands, \
one for polynomials \\polynomial{coeffs} and one for rational \
functions \\polynomialfrac{Numerator}{Denominator}. Both \
commands take lists of coefficients as arguments, and offer \
limited optional behaviour."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-polynomial-2023.201.1.0svn15878-52.1.noarch.rpm"
RPM_HASH = "3102f4605e7c8c5e462c0eb1e978fdc06c866273831ee50b1de81c86e027167ee7a51799dbb53c899ecc722c22938274cc216efdc631d3e01c2112bc35acced1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(polynomial.sty) \
texlive-polynomial"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(keyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
