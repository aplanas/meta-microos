SUMMARY = "Simplified brackets and differentials in LaTeX"
DESCRIPTION = "The package simplifies the process of writing differential \
operators and brackets in LaTeX. The commands facilitate the \
easy manipulation of equations involving brackets and allow \
partial differentials to be expressed in an alternate form."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn35383"

RPM_NAME = "texlive-bropd-2023.201.1.2svn35383-52.1.noarch.rpm"
RPM_HASH = "acb6825561861bd748bca9c3d827ea27026a5ec5b34e04070b5104985cf54579e147393d34fa17d62557a24bd422ee34a9d8890a904b358e0472f9de906d61fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bropd.sty) \
texlive-bropd"

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
