SUMMARY = "Logarithms and powers with (almost) 9 digits"
DESCRIPTION = "This small package (usable with Plain e-TeX, LaTeX, or others) \
with no dependencies provides two fast expandable macros \
computing logarithms in base 10 and fractional powers of 10. \
They handle arguments of 9 digit tokens which stand for either \
1 <= d.dddddddd < 10 (for the log) or 0.xxxxxxxxx (for powers \
of 10). They achieve a precision of 1ulp for the logarithm and \
2ulp for fractional powers of ten. Extension to other numerical \
ranges has to be done by user, via own macros or some math \
engine. The xintexpr package (at 1.3f) imports the poormanlog \
macros as core constituents of its log10(), pow10(), log(), \
exp() and pow() functions."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.07svn63400"

RPM_NAME = "texlive-poormanlog-2023.209.0.0.07svn63400-53.1.noarch.rpm"
RPM_HASH = "fbb31c1d825ac35174a274883aeba0d9ea2af3c5f76aeca336ac8ddc5b25a6c2c57e1014cae8228bb65b618e3baa5fd90fa4b3ea3cfd6e51546094e09e1582d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-poormanlog.sty \
tex-poormanlog.tex \
texlive-poormanlog"

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
