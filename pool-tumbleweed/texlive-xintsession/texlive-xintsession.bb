SUMMARY = "Interactive computing sessions (fractions, floating points, polynomials)"
DESCRIPTION = "This package provides support for interactive computing \
sessions with etex (or pdftex) executed on the command line, on \
the basis of the xintexpr and polexpr packages. Once \
xintsession is loaded, eTeX becomes an interactive computing \
software capable of executing arbitrary precision calculations, \
or exact calculations with arbitrarily big fractions. It can \
also manipulate polynomials as algebraic entities. Numerical \
variables and functions can be defined during the session, and \
each evaluation result is stored in automatically labeled \
variables. A file is automatically created storing inputs and \
outputs."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4alphasvn60926"

RPM_NAME = "texlive-xintsession-2023.209.0.0.4alphasvn60926-53.1.noarch.rpm"
RPM_HASH = "b41b1ecbfaa32dfe814bdacac23d2932f800fea525c46bbdf5613f30963100be2944a2d3635fc2b94e47c77da957f2b50cc2cbddf0795029ae1875aff79c16b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xintsession.tex \
texlive-xintsession"

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
