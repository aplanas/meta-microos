SUMMARY = "Haifeng Wubi input method"
DESCRIPTION = "Haifeng Wubi input methods. Current includes: \
Haifeng Wubi 86."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.12"

RPM_NAME = "ibus-table-chinese-wubi-haifeng-1.8.12-1.1.noarch.rpm"
RPM_HASH = "a72ab09a209c4e3bd335458148336e9695ed4dd4b3f8ab203d01ff88d9ea9a289d2c4fab1e0702390a8b59bdcc658c470961ba412a4c2420d80c78adf756f327"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-chinese-wubi-haifeng \
ibus-table-wubi \
locale-ibus-zh-CN"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
