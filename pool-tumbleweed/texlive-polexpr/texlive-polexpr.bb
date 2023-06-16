SUMMARY = "A parser for polynomial expressions"
DESCRIPTION = "The package provides a parser \\poldef of algebraic polynomial \
expressions. As it is based on xintexpr, the coefficients are \
allowed to be arbitrary rational numbers. Once defined, a \
polynomial is usable by its name either as a numerical function \
in \\xintexpr/\\xinteval, or for additional polynomial \
definitions, or as argument to the package macros. The \
localization of real roots to arbitrary precision as well as \
the determination of all rational roots is implemented via such \
macros. Since release 0.8, polexpr extends the xintexpr syntax \
to recognize polynomials as a new variable type (and not only \
as functions). Functionality which previously was implemented \
via macros such as the computation of a greatest common divisor \
is now available directly in \\xintexpr, \\xinteval or \\poldef \
via infix or functional syntax."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8.7asvn63337"

RPM_NAME = "texlive-polexpr-2023.201.0.0.8.7asvn63337-52.1.noarch.rpm"
RPM_HASH = "f0032702256a55230cf8f4450f6c30ceb39e2a1b6d7effc22e1e2b14e30b2040b936c8facc6528ac19bdebb9497ceccf1599146eea0075dde0ef46c7d1f9d9aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-polexpr-examples.tex \
tex-polexpr.sty \
tex-polexprcore.tex \
tex-polexprexpr.tex \
tex-polexprsturm.tex \
texlive-polexpr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xintexpr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
