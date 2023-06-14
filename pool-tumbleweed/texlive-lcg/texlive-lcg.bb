SUMMARY = "Generate random integers"
DESCRIPTION = "The lcg package generates random numbers (integers) via a \
linear congruential generator (Schrage's method). The random \
numbers are written to a counter. The keyval package is used \
for the user to provide values for the range and a seed, and \
for the name of the counter to be used."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn31474"

RPM_NAME = "texlive-lcg-2023.201.1.3svn31474-54.1.noarch.rpm"
RPM_HASH = "9c3e268140f57c84bef2d4ddfbdb585d6d22366d55091242a777419a944bf3ad8ebca80814d04c1f76a0d7893f6055cd46f0b529566ab4f78d535317acfbb72c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lcg.sty \
texlive-lcg"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
