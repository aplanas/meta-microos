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

PV = "2023.201.0.0.4alphasvn60926"

RPM_NAME = "texlive-xintsession-2023.201.0.0.4alphasvn60926-52.2.noarch.rpm"
RPM_HASH = "548b8401b1c5cab7aed887b6271ec6d75b1d368c723d1192931e419a0868d0279f7c478455742065d02b4bdde12318a0dd706a9fda2ffe98652f7644d8cfa008"
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
