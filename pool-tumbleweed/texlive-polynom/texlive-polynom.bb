SUMMARY = "Macros for manipulating polynomials"
DESCRIPTION = "The polynom package implements macros for manipulating \
polynomials, for example it can typeset long polynomial \
divisions. The main test case and application is the polynomial \
ring in one variable with rational coefficients."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.19svn44832"

RPM_NAME = "texlive-polynom-2023.201.0.0.19svn44832-52.1.noarch.rpm"
RPM_HASH = "6d2716c4aa257181f34d6536d4f86772e0f0929e985abaebab14290a0c4d5011d93dbb940c81bcdc7fe27158a5901bd4af2d057cb3444dd312021221225492da"
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
