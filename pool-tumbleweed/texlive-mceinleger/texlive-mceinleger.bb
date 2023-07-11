SUMMARY = "Creating covers for music cassettes"
DESCRIPTION = "A package for creating MC-covers on your own. It allows the \
creation of simple covers as well as covers with an additional \
page for more information about the cassette (table of contents \
e.g.). The rotating package is required."
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.svn15878"

RPM_NAME = "texlive-mceinleger-2023.208.svn15878-53.1.noarch.rpm"
RPM_HASH = "c8a1cdbb1f953f2528edc1d02b0716cd2d31b122df9e7530e6039042b5c752758580e5185f894e45d82e0ba7443e2817eed8481268bd192c2b7d75f5c357260a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mceinleger.sty \
texlive-mceinleger"

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
