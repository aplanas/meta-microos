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

RPM_NAME = "texlive-xintsession-2023.201.0.0.4alphasvn60926-52.1.noarch.rpm"
RPM_HASH = "005af6110e215480913ff6668b84f66ec35044de5d6f8c65bc17a5d5f558dd4ff24e08e9e171bbf205c4da02bb8f9a82de89a9d78950f9dcab6a7733cf8933ce"
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
