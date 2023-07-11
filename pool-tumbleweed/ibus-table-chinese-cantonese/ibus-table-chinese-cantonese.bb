SUMMARY = "Cantonese input methods"
DESCRIPTION = "Cantonese input methods, including: \
Cantonese, Hong-Kong version of Cantonese."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.12"

RPM_NAME = "ibus-table-chinese-cantonese-1.8.12-1.2.noarch.rpm"
RPM_HASH = "8481946ffa24c00a057239eb3c8abd7706d7ef7ec54e3551b742674fae7ab23fc4f12e3b4dce153dadb1cd4c7af34295424edc1d472710f56dc37c3e9a8d94bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-cantonese \
ibus-table-chinese-cantonese \
locale-ibus-zh-TW;zh-HK"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
