SUMMARY = "Jidian Wubi input method"
DESCRIPTION = "Jidian Wubi input methods. Current includes: \
Wubi 86."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.12"

RPM_NAME = "ibus-table-chinese-wubi-jidian-1.8.12-1.2.noarch.rpm"
RPM_HASH = "47209f6395e8b7e421b27923a9b0ba8d4bacabad60424a479386042ed1bbcff0d33e7d19f3d19d39cba0bfee359517b9a814b19791cbace3377cc01c5e1cd1a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-chinese-wubi-jidian \
ibus-table-wubi \
locale-ibus-zh-CN"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
