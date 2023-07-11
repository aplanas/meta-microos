SUMMARY = "Noto Music Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Music font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-music-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "2538242bd53739a572832cce627600173ac16011c543eb5f618eaddde5983767d0f311bb94b71856fc9ba3d94f21c8d782cf4e1b076e1846d986d00b13022f64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-music \
noto-music-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
