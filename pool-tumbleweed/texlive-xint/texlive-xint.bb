SUMMARY = "Expandable operations on long numbers"
DESCRIPTION = "The xint bundle main modules are: xinttools utilities of \
independent interest such as expandable and non-expandable \
loops, xintcore expandable macros implementing addition, \
subtraction, multiplication, division, and powers for \
arbitrarily long integers, xint extension of xintcore, xintfrac \
extends the scope of xint to decimal numbers, to numbers using \
scientific notation and also to (exact) fractions, xintexpr \
provides expandable parsers of numeric expressions using the \
standard infix notations, parentheses, built-in functions, user \
definable functions and variables (and more ...) which do \
either exact evaluations (also with fractions) or floating \
point evaluations under a user chosen precision. Further \
modules of the bundle are: xintkernel (support macros for all \
the bundle constituents), xintbinhex (conversion to and from \
hexadecimal and binary bases), xintgcd (provides gcd() and \
lcm() functions to xintexpr), xintseries (evaluates numerically \
partial sums of series and power series with fractional \
coefficients), and xintcfrac (dedicated to the computation and \
display of continued fractions). All computations are \
compatible with expansion-only context. The packages may be \
used with Plain TeX, LaTeX, or (a priori) any other macro \
format built upon TeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4msvn63562"

RPM_NAME = "texlive-xint-2023.201.1.4msvn63562-52.2.noarch.rpm"
RPM_HASH = "f1584a40ad0cb786da6ef1350ca6c8f188588864978329d616f4faa05bbfa992e60ac4f382213542fe7a871d7721b30295d3d987f1b5d38888393dbd78b0cc28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xint.sty \
tex-xintbinhex.sty \
tex-xintcfrac.sty \
tex-xintcore.sty \
tex-xintexpr.sty \
tex-xintfrac.sty \
tex-xintgcd.sty \
tex-xintkernel.sty \
tex-xintlog.sty \
tex-xintseries.sty \
tex-xinttools.sty \
tex-xinttrig.sty \
texlive-xint"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-poormanlog.sty \
tex-poormanlog.tex \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
