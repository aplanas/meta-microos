SUMMARY = "Noto Tamil Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tamil Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tamil-ui-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "4ef039043155acf2ff26807da9abb169dff32a39ee0e6335399764cc055452147d2e07e5c35f7aef2b413e666049f0426c1c62bc7c55a1862c86a67156e48243"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tamil-ui \
noto-sans-tamil-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
