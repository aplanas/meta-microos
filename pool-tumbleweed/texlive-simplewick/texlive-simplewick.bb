SUMMARY = "Simple Wick contractions"
DESCRIPTION = "The package provides a simple means of drawing Wick \
contractions above and below expressions."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.2asvn15878"

RPM_NAME = "texlive-simplewick-2023.201.1.2asvn15878-53.1.noarch.rpm"
RPM_HASH = "ef4e4fd4c72b2c20c03b6442ba34f5c70e80f08d606e352a7b1e81085a2b2ec948bc946b20d777faf7a8908ec8f15f5754bd3db45a8a7d5f748133625ca7c622"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(simplewick.sty) \
texlive-simplewick"

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
