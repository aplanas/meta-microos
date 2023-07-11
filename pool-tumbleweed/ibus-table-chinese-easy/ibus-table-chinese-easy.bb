SUMMARY = "The so-called 'easy' input method for Chinese"
DESCRIPTION = "Easy phrase-wise input method."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.12"

RPM_NAME = "ibus-table-chinese-easy-1.8.12-1.2.noarch.rpm"
RPM_HASH = "8fc81a3dd12644aa8d85caa713568a06e46ea4133833acdd0aadd2e76a1da30ccb0cbfc52dbde5486f1705d66ed1a95ac7aa84571a240b502d59708adb5d1e8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-chinese-easy \
ibus-table-easy \
locale-ibus-zh-TW;zh-HK"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
