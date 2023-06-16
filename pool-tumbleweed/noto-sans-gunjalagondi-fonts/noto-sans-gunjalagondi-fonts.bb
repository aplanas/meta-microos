SUMMARY = "Noto Gunjala Gondi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
GunjalaGondi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-gunjalagondi-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "dacc99d994431779914017ab731b50b034868c85295bd76eccc55e319852d8dc2d409fa418dc1d3a869a2e001b32b02bf80d7a37b16db2388a195d47d09fe629"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-gunjalagondi \
noto-sans-gunjalagondi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
