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

PV = "2023.201.1.2csvn39766"

RPM_NAME = "texlive-splitindex-2023.201.1.2csvn39766-57.1.noarch.rpm"
RPM_HASH = "d38c3d2b36ea17e13e666f7724d7c9474cb782f82d226bcd34ecdade335ff1948d264de3dd71136db4641318d32f2baa5fefcbfa3ec24d77a4a833dd7e877fd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(splitidx.sty) \
tex(splitindex.tex) \
texlive-splitindex"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
perl(Getopt::Long) \
perl(strict) \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-splitindex-bin"

inherit rpm
