SUMMARY = "Unlimited number of indexes"
DESCRIPTION = "SplitIndex consists of a LaTeX package, splitidx, and a small \
program, splitindex. The package may be used to produce one \
index or several indexes. Without splitindex (for example, \
using the index package), the number of indexes is limited by \
the number of TeX's output streams. But using the program you \
may use even more than 16 indexes: splitidx outputs only a \
single file \\jobname.idx and the program splits that file into \
several raw index files and calls your favorite index processor \
for each of the files."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2csvn39766"

RPM_NAME = "texlive-splitindex-2023.209.1.2csvn39766-58.1.noarch.rpm"
RPM_HASH = "d31406f1062a12574108f2092bd09e2a33f2d62a3baa65dbf836a0fd0ee75b6726fcfd4d16442ddb832a2382d9e39a4cd8af998b12451e8f0669e1c5eef38db3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-splitidx.sty \
tex-splitindex.tex \
texlive-splitindex"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
perl-Getopt--Long \
perl-strict \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-splitindex-bin"

inherit rpm
