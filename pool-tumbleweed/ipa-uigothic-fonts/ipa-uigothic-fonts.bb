SUMMARY = "'UI Gothic' Japanese TrueType Font Made by IPA"
DESCRIPTION = "'UI Gothic' Japanese TrueType font made by IPA (Information-technology \
Promotion Agency)."
LICENSE = "IPA"

PV = "002.003"

RPM_NAME = "ipa-uigothic-fonts-002.003-67.17.noarch.rpm"
RPM_HASH = "cfef4c53d0b29c8d7bd9d2bc8db14495634291b22efe41267ff28d0f287030e0bbc498b1ce86d53e3f291ea69252883bdba1669f0db221c16b9dce90d1818728"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPUIGothic \
ipa-uigothic-fonts \
locale-ja \
scalable-font-ja"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
