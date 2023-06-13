SUMMARY = "Noto Brahmi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Brahmi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-brahmi-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "9f664bca8b343412df7dbf0554a9fb6579ffb644aac90a566216dce9542b849bbaaf650231e6246dd2491723ef90872e0f854ea0fbe85aa89181ad353d9d9184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-brahmi \
noto-sans-brahmi-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
