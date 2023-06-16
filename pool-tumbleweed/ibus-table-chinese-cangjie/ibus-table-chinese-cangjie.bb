SUMMARY = "Cangjie based input methods"
DESCRIPTION = "Cangjie based input methods, including: \
Cangjie3, Canjie5, and Cangjie big tables."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.12"

RPM_NAME = "ibus-table-chinese-cangjie-1.8.12-1.1.noarch.rpm"
RPM_HASH = "3c1ea3e589ffea933339304d99f510d91015f53c556fb6b651f5d3de733b0d3ee14651a597aff8956ab4f84ea542668641e19bb6144d2c6069099d2306d613f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-cangjie \
ibus-table-chinese-cangjie \
locale-ibus-zh-TW;zh-HK"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
