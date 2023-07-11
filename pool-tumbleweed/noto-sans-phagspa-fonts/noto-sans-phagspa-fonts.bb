SUMMARY = "Noto Phags Pa Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
PhagsPa Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-phagspa-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "4cf44ed1fc5dc7aa2fbb8f902da4b0993ae825dcfdad213ee1c50ce94d3579f1f554a1a19a78d7f8a85cb496869111cecdd2b6f4721f2af38767c6b552692d9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-phagspa \
noto-sans-phagspa-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
