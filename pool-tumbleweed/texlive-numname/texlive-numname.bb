SUMMARY = "Convert a number to its English expression"
DESCRIPTION = "The package can generate cardinal (one, two, ...) and ordinal \
(first, second, ...) numbers. The code derives from the memoir \
class, and is extracted for the convenience of non-users of \
that class."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn18130"

RPM_NAME = "texlive-numname-2023.209.svn18130-55.1.noarch.rpm"
RPM_HASH = "68b8ca6bb7328ce58ee5e9b8c2cc519210f976012c973e561877dab8008bddb968ddd62f443ff738d1bdbffeead2a028f3b7b744febda0faf65fed5d96a8b78a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-numname.sty \
texlive-numname"

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
