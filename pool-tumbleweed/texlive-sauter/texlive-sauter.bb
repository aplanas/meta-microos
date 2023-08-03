SUMMARY = "Wide range of design sizes for CM fonts"
DESCRIPTION = "Extensions, originally to the CM fonts, providing a \
parameterization scheme to build Metafont fonts at true design \
sizes, for a large range of sizes. The scheme has now been \
extended to a range of other fonts, including the AMS fonts, \
bbm, bbold, rsfs and wasy fonts."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.4svn13293"

RPM_NAME = "texlive-sauter-2023.209.2.4svn13293-54.1.noarch.rpm"
RPM_HASH = "f7c21c2646bfccfa3a84f315243acf315d33087b6e2fd2044eba701cee9f4cb26cb33be8bfd5d4a79653d12d71e971f64390f20ef7fbcd4dd985797ba951c414"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sauter"

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
