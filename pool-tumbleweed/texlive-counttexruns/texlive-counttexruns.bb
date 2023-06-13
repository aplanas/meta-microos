SUMMARY = "Count compilations of a document"
DESCRIPTION = "The package counts how often a LaTeX document is compiled, \
keeping the data in an external file. To print the count, can \
use the macro \\thecounttexruns."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.00asvn27576"

RPM_NAME = "texlive-counttexruns-2023.204.1.00asvn27576-54.1.noarch.rpm"
RPM_HASH = "25ac31f2ddcfb3ad1521b28f728e77d2d2ad61758e1d6f450eb273a2c6fa8eb7916ec39d7bfa92744cf76046c1b3ebf6c91187746262da26137403badfb03cd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(counttexruns.sty) \
texlive-counttexruns"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(kvoptions.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
