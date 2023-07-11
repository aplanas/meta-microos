SUMMARY = "Noto Bengali Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Bengali Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-bengali-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "6ebd132b174f085f14c575ba66e3dff4cc87d13f277dd5ba0056271dc87c5b53569ac4e94636d267e570ea7b062354089ad99624f83b0b2f31fc1d74dce3b665"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-bengali \
noto-sans-bengali-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
