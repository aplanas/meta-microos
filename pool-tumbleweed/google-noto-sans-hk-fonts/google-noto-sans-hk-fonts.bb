SUMMARY = "Noto Sans Traditional Chinese (Hong Kong) Font - Regular and Bold"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Regular and Bold \
weights of Sans font for Traditional Chinese (Hong Kong), hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-hk-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "8610b2407da98ba65a005d2b9380fbfff6dd6f5bfdaf41dc1905552a68d3a485c6911ceca913d879f3eb4e6541c4ee6ce6b934c87045654ad2a88de6e6f83798"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-hk-fonts \
locale(zh_HK;zh_MO) \
noto-sans-cjkhk \
noto-sans-cjkhk-fonts \
noto-sans-hk-fonts \
scalable-font-zh-HK \
scalable-font-zh-MO"
RDEPENDS:${PN} += "google-noto-sans-hk-bold-fonts \
google-noto-sans-hk-regular-fonts"

inherit rpm
