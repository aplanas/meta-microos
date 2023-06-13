SUMMARY = "Noto Malayalam Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Malayalam Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-malayalam-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "872fb1a3d270cc0eaecf0e6fb3bc7715a29b882f117c12f80a57dfae9702b80b77b9629ae023489c2ff969b43fc9bba1c9f57710a5fd89a53c0b3873224412ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-malayalam \
noto-serif-malayalam-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
