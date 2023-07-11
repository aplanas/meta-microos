SUMMARY = "Noto Runic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Runic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-runic-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "d6cfe16f5c0b67232537184aeca721e31250b439f0eb7728cf5d81a87c4c17c8aa20f5753747c71556b4f4fd73e7a0b061f91c0721e860b9eafbc8e862ec3f7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-runic \
noto-sans-runic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
