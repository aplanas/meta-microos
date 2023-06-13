SUMMARY = "Noto Ahom Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Ahom Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-ahom-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "cd0350eb818ddcbc79c521498fe219a71ba0d8afa5d3096986a21b92e23dd030a0e24459c2309b51b8ffd01b598a431c84f59bdbf578d50e53b2bed3c2c4cd63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-ahom \
noto-serif-ahom-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
