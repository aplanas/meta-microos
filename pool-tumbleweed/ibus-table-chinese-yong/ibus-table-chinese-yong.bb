SUMMARY = "YongMa input method"
DESCRIPTION = "YongMa input method."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.12"

RPM_NAME = "ibus-table-chinese-yong-1.8.12-1.1.noarch.rpm"
RPM_HASH = "c7437eee25fded2cbb94a0eedce9097371dc304781098f02a088c2001b9ec938c22e760343c4792c1d5c5c634b11b41096502573f75cca4bf9c3d29c31dd55d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-chinese-yong \
ibus-table-yong \
locale(ibus:zh_CN)"
RDEPENDS:${PN} += "/bin/sh \
ibus-table"

inherit rpm
