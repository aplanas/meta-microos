SUMMARY = "Noto Ethiopic Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Ethiopic Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-ethiopic-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "83a771559145fcad92dd1aefdf4220e5d0afe372424829694f0a32fff2610dd89dffcb423b62922d88aacbc89c9563d7c5ef6dae1b078f42c93c37bf4ad1ef2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-ethiopic \
noto-serif-ethiopic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
