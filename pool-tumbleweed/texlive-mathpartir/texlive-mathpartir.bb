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

PV = "2023.208.1.3.2svn39864"

RPM_NAME = "texlive-mathpartir-2023.208.1.3.2svn39864-53.1.noarch.rpm"
RPM_HASH = "5b2151bcae3d25d0b3b4b830454a55d05e18a764c9dfc9d88edac517c25c19ae799d6b3c5cc212482a13686bd6558f9820bab0373f1c28cad78217cc91ce729e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathpartir.sty \
texlive-mathpartir"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
