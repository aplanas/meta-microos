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

PV = "2023.209.1.0svn59268"

RPM_NAME = "texlive-pgfmath-xfp-2023.209.1.0svn59268-52.1.noarch.rpm"
RPM_HASH = "25d88934639df200fbb0406af8511c13d9bcfd4f83149150c46015065c0eb1942534fcc7f5f0ba0acade684657d3cfdf58eed73bfbb7e16cd69cde97fabeea27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgfmath-xfp.sty \
texlive-pgfmath-xfp"

RDEPENDS:${PN} += "/usr/bin/sh \
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
