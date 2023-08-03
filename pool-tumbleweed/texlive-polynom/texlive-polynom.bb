SUMMARY = "Macros for manipulating polynomials"
DESCRIPTION = "The polynom package implements macros for manipulating \
polynomials, for example it can typeset long polynomial \
divisions. The main test case and application is the polynomial \
ring in one variable with rational coefficients."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.19svn44832"

RPM_NAME = "texlive-polynom-2023.209.0.0.19svn44832-53.1.noarch.rpm"
RPM_HASH = "0bc55f87e95266a71b14af0c2a2ed75027cbac35c694f4278f0ca3565e26fc2d9638b1e542e2dafa7fef9b8cc2c36b8757d0bf667571a9873419135f79c0bded"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-polynom.sty \
texlive-polynom"

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
