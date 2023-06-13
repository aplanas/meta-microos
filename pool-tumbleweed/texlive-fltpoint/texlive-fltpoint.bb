SUMMARY = "Simple floating point arithmetic"
DESCRIPTION = "The package provides simple floating point operations \
(addition, subtraction, multiplication, division and rounding). \
Used, for example, by rccol."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1bsvn56594"

RPM_NAME = "texlive-fltpoint-2023.201.1.1bsvn56594-52.1.noarch.rpm"
RPM_HASH = "34949046b916de4d4a89b4b96ab7945209098bd975ed90f4cdab497a791c6dd9f1ff5e775ff717bd89992977488541f6dbe830160f646fec88c082898a2d5208"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(deccomma.sty) \
tex(fltpoint.sty) \
tex(fltpoint.tex) \
texlive-fltpoint"

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
