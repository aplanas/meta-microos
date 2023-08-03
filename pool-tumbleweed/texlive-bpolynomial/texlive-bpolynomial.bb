SUMMARY = "Drawing polynomial functions of up to order 3"
DESCRIPTION = "This MetaPost package helps plotting polynomial and root \
functions up to order three. The package provides macros to \
calculate Bezier curves exactly matching a given constant, \
linear, quadratic or cubic polynomial, or square or cubic root \
function. In addition, tangents on all functions and \
derivatives of polynomials can be calculated."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn15878"

RPM_NAME = "texlive-bpolynomial-2023.209.0.0.5svn15878-53.1.noarch.rpm"
RPM_HASH = "d409afba332569a73d760c3865cfe58f718c2aa539750bbfabd52b2b36ad456fc8b619a0f2f4a20df380af8454d61c53ab1dd8b92e2be5a3db5f842ed9a0d626"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bpolynomial"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
