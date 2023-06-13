SUMMARY = "Typesetting sequences of math formulas, e.g. type inference rules"
DESCRIPTION = "The package provides macros for typesetting math formulas in \
mixed horizontal and vertical mode, automatically as best fit. \
It provides an environment mathpar that behaves much as a loose \
centered paragraph where words are math formulas, and spaces \
between them are larger and adjustable. It also provides a \
macro \\inferrule for typeseting fractions where both the \
numerator and denominator may be sequences of formulas that \
will be also typeset in a similar way. It can typically be used \
for typeseting sets of type inference rules or typing \
derivations. A macro inferrule for typesetting type inference \
rules."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3.2svn39864"

RPM_NAME = "texlive-mathpartir-2023.201.1.3.2svn39864-52.1.noarch.rpm"
RPM_HASH = "88cc5f8076998851326c12b0b43c68aa1dded87fbd5c29140a591ed75183c3c913522d33c6c0fe88fc6416a57a0b2758fbdb3978023b1967e2395e02baae5b99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mathpartir.sty) \
texlive-mathpartir"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(keyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
