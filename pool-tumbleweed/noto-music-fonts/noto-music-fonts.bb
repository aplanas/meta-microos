SUMMARY = "Noto Music Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Music font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-music-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "2936cd00c803a6497c21d3abc15188221188096fe40f81755da93ab709323d66e913fd40775213fd49d2b297bdf338517c6247f5232a49d3b7a34db92cceebdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-music \
noto-music-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
