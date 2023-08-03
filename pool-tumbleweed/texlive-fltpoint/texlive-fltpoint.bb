SUMMARY = "Simple floating point arithmetic"
DESCRIPTION = "The package provides simple floating point operations \
(addition, subtraction, multiplication, division and rounding). \
Used, for example, by rccol."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1bsvn56594"

RPM_NAME = "texlive-fltpoint-2023.209.1.1bsvn56594-53.1.noarch.rpm"
RPM_HASH = "c8108108082e5540354a41b62a294a4682bc24494cea0fc5d052f8c22986f57cded8f2528d2c84c86b413b755e783806b9dabb8d9630faab7d4169828726b4b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-deccomma.sty \
tex-fltpoint.sty \
tex-fltpoint.tex \
texlive-fltpoint"

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
