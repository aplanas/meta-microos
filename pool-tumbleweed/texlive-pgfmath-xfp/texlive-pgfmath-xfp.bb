SUMMARY = "Define pgfmath functions using xfp"
DESCRIPTION = "This package allows to define pgfmath functions that use the \
xfp fpu for their calculations. The input arguments are parsed \
with pgfmath (while the pgf-fpu is locally active), and the \
results are forwarded to xfp's fpu for the function evaluation. \
The result of that calculation is then parsed by pgfmath again \
(with the surrounding settings of pgfmath). This way the \
functions should be usable in every pgfmath context, though \
there is some overhead to this approach. The package is only \
meant as a temporary stopgap until a more dedicated solution is \
available to use xfp in pgf."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn59268"

RPM_NAME = "texlive-pgfmath-xfp-2023.201.1.0svn59268-51.1.noarch.rpm"
RPM_HASH = "3a99c06fdff3f110a1d66078059c2cc8a0120b8d29690fbe30f10ea5dde9f358f0251f8b1e21f6beca8d131d869754749cb36982fa20c3aaa4a068086ce6fb2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgfmath-xfp.sty \
texlive-pgfmath-xfp"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-pgfmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
