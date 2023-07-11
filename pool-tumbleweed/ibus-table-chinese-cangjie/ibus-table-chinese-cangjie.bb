SUMMARY = "Cangjie based input methods"
DESCRIPTION = "Cangjie based input methods, including: \
Cangjie3, Canjie5, and Cangjie big tables."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.12"

RPM_NAME = "ibus-table-chinese-cangjie-1.8.12-1.2.noarch.rpm"
RPM_HASH = "25e22bd408b41dfe1d37dc909368a48b277018d9499af2bab6225aac93d7ac00b5786f22baee00cb838a8f13dc16b67eebc306217a2b6bfcf0b59d6d3dd50051"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-cangjie \
ibus-table-chinese-cangjie \
locale-ibus-zh-TW;zh-HK"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
