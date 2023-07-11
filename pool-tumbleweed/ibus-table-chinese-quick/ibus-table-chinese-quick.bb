SUMMARY = "The so-called 'Quick-to-learn' input methods for Chinese"
DESCRIPTION = "Quick-to-learn is based on the Cangjie input method, \
but only needs Cangjie's first and last word-root \
to form a character. \
 \
Includes: \
Quick3, Quick5 and Quick-Classic, \
and Smart Cangjie 6."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.12"

RPM_NAME = "ibus-table-chinese-quick-1.8.12-1.2.noarch.rpm"
RPM_HASH = "1d9dee43828fc94922b08c13b5f8aca3250e2efd1760ab46a04568ba5a82771bb1aaf49fdf14e841600fff640c6fc6adafed4e9c8203536cff6b23d01a656d05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-chinese-quick \
ibus-table-quick \
locale-ibus-zh-TW;zh-HK"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
