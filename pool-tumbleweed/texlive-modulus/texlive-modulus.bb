SUMMARY = "A non-destructive modulus and integer quotient operator for TeX"
DESCRIPTION = "The package provides an easy way to take the remainder of a \
division operation without destroying the values of the \
counters containing the dividend and divisor. Also provides a \
way to take the integer quotient of a division operation \
without destroying the values of the counters containing the \
dividend and divisor. A tiny but occasionally useful package, \
when doing heavy TeX programming."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn47599"

RPM_NAME = "texlive-modulus-2023.209.1.0svn47599-55.1.noarch.rpm"
RPM_HASH = "a44fd7c658b0d2db0ba0607422140421fb447e16e2ae21f4eb18e5243b8623ec74640e043fe27b476bc7cd6f5ef303066ec82766e7f951b2acd8af80c32c3ff6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-modulus.sty \
texlive-modulus"

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
