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

PV = "2023.209.0.0.8.7asvn63337"

RPM_NAME = "texlive-polexpr-2023.209.0.0.8.7asvn63337-53.1.noarch.rpm"
RPM_HASH = "52966562f43029ae83d2468cd13964629d947899fd85d150841d7c7bcfa73afc3c412aa2406f8f475459f28ae4dc34259f53df0445477f4bf1d13029bf57ba6a"
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
