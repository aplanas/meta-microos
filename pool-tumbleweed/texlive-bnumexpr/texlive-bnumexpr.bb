SUMMARY = "Extends eTeX's \\numexpr...\\relax construct to big integers"
DESCRIPTION = "The package extends e-TeX \\numexpr...\\relax operation to allow \
big integers, powers, factorials, truncated division and its \
associated modulo. By default, bnumexpr loads package xintcore \
(part of the xint bundle) and uses its arithmetic macros."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn59244"

RPM_NAME = "texlive-bnumexpr-2023.209.1.5svn59244-53.1.noarch.rpm"
RPM_HASH = "5246af8197e6f0519fef1d8234fba46b856892bdc6c9e1e1e8ae5a2cdbc04844c9cda49e2946fb712a8432a0d57407193f53394524a205b66f70abcce949079a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bnumexpr.sty \
texlive-bnumexpr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xintbinhex.sty \
tex-xintcore.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
