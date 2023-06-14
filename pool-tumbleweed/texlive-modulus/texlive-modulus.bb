SUMMARY = "A non-destructive modulus and integer quotient operator for TeX"
DESCRIPTION = "The package provides an easy way to take the remainder of a \
division operation without destroying the values of the \
counters containing the dividend and divisor. Also provides a \
way to take the integer quotient of a division operation \
without destroying the values of the counters containing the \
dividend and divisor. A tiny but occasionally useful package, \
when doing heavy TeX programming."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn47599"

RPM_NAME = "texlive-modulus-2023.201.1.0svn47599-54.1.noarch.rpm"
RPM_HASH = "aef99c8787f60583c36014a33cdd04f37aba54ed313ab94bd4e371699a4727c286a8355dfdb98a5331582f23c92c3ef612da08c47c5d010a01f5b482ea2b6b4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-modulus.sty \
texlive-modulus"

RDEPENDS:${PN} += "/bin/sh \
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
