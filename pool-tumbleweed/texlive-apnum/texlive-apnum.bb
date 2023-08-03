SUMMARY = "Arbitrary precision numbers implemented by TeX macros"
DESCRIPTION = "The basic operations (addition, subtraction, multiplication, \
division, power to an integer) are implemented by TeX macros in \
this package. Operands may be numbers with arbitrary numbers of \
digits; scientific notation is allowed. The expression scanner \
is also provided. As of version 1.4 (December 2015) the \
calculation of common functions (sqrt, exp, ln, sin, cos, tan, \
asin, acos, atan, pi) with arbitrary precision in the result \
has been added. Exhaustive documentation (including detailed \
TeXnical documentation) is included. The macro includes many \
optimizations and uses only TeX primitives (from classic TeX) \
and \\newcount macro."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.7svn47510"

RPM_NAME = "texlive-apnum-2023.209.1.7svn47510-55.1.noarch.rpm"
RPM_HASH = "5bc2354afe001cd5c39a478c5f8c7e2f8c0c5a9b1514c403da94f3a36e3711f13a04767a06fe9b2048c6b4d303660b59d7c6375bab28da1a91f974d36864fe27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-apnum.tex \
texlive-apnum"

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
