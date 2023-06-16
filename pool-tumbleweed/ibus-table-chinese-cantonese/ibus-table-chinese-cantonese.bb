SUMMARY = "Cantonese input methods"
DESCRIPTION = "Cantonese input methods, including: \
Cantonese, Hong-Kong version of Cantonese."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.12"

RPM_NAME = "ibus-table-chinese-cantonese-1.8.12-1.1.noarch.rpm"
RPM_HASH = "1ebc7279b541ec0b872a2db51580b303265ac7f2b4abfbd837ddad4213e91ad2f8ad1628a67166fd86f87414abc16f59178889116a1961df1c209170b11452da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-cantonese \
ibus-table-chinese-cantonese \
locale-ibus-zh-TW;zh-HK"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
