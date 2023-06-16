SUMMARY = "PSTricks package for plotting mathematical functions"
DESCRIPTION = "The package is built for use with PSTricks. It provides macros \
for plotting and manipulating various mathematical functions: \
polynomials and their derivatives \
f(x)=an*x^n+an-1*x^(n-1)+...+a0 defined by the coefficients a0 \
a1 a2 ... and the derivative order; the Fourier sum f(x) = \
a0/2+a1cos(omega x)+...+b1sin(omega x)+... defined by the \
coefficients a0 a1 a2 ... b1 b2 b3 ...; the Bessel function \
defined by its order; the Gauss function defined by sigma and \
mu; Bezier curves from order 1 (two control points) to order 9 \
(10 control points); the superellipse function (the Lame \
curve); Chebyshev polynomials of the first and second kind; the \
Thomae (or popcorn) function; the Weierstrass function; various \
integration-derived functions; normal, binomial, poisson, \
gamma, chi-squared, student's t, F, beta, Cauchy and Weibull \
distribution functions and the Lorenz curve; the zeroes of a \
function, or the intermediate point of two functions; the \
Vasicek function for describing the evolution of interest \
rates; and implicit functions. The plots may be generated as \
volumes of rotation about the X-axis, as well."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.99svn60933"

RPM_NAME = "texlive-pst-func-2023.201.0.0.99svn60933-52.1.noarch.rpm"
RPM_HASH = "2d4f3176e77a70a3ec086640783a8ad5dc03bc5a97d2ee33f35b49d72e7320615974e56b0d573208cbb849d64d96cb23b32264c32105843c94731b45ef24e982"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-func.sty \
tex-pst-func.tex \
texlive-pst-func"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-math.sty \
tex-pst-plot.sty \
tex-pst-tools.sty \
tex-pst-xkey.sty \
tex-pstricks-add.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
