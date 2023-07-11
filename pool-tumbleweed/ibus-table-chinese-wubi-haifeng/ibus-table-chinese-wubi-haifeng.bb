SUMMARY = "Haifeng Wubi input method"
DESCRIPTION = "Haifeng Wubi input methods. Current includes: \
Haifeng Wubi 86."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.12"

RPM_NAME = "ibus-table-chinese-wubi-haifeng-1.8.12-1.2.noarch.rpm"
RPM_HASH = "854afc8b9c81134ad53722f168959e8f6a88b75518f19c59ae7188ae48cef583af59c1f54311a950ae6a2a0005ab6f2ef38bf19f1b15699c9d9b60f8cbe4831f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-chinese-wubi-haifeng \
ibus-table-wubi \
locale-ibus-zh-CN"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
