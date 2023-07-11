SUMMARY = "\\newcommand-like commands for defining math macros"
DESCRIPTION = "This package provides functionalities for defining macros that \
have different behaviors depending on whether in math or text \
mode, that absorb Primes, Indices and Exponents (PIE) as extra \
parameters usable in the code; and it offers some iteration \
facilities for defining macros with similar code. The primary \
objective of this package is to be used together with the \
knowledge package for a proper handling of mathematical \
notations."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.04svn59512"

RPM_NAME = "texlive-mathcommand-2023.208.1.04svn59512-53.1.noarch.rpm"
RPM_HASH = "fe6196ab5b3073a03b36782fbc90c114dadb5443e58ca4d85f3ec7c94a573e0979fe3b4ee2566977dd0f7918530dd57d40e23f3901110c36d57237464bbd8a57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathcommand.sty \
texlive-mathcommand"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
