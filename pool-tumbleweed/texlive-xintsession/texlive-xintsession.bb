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

RPM_NAME = "texlive-xintsession-2023.209.0.0.4alphasvn60926-53.2.noarch.rpm"
RPM_HASH = "b43da7173f323d9ab1d11a286511730d6162a42d8a344678b3f63740920ae1de918aabb7a4af4f0eed90b08ace829416658369106f180bcd113b25acd1709b5c"
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
