SUMMARY = "Jyutping input method"
DESCRIPTION = "ibus-table-jyutping provides the Jyutping input method on IBus Table under \
the IBus framework."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.12"

RPM_NAME = "ibus-table-chinese-jyutping-1.8.12-1.2.noarch.rpm"
RPM_HASH = "b7534d9781fff0fa7a6676530e4d9b9c3d5eefba8eb9818a4983e4c0255d515cb7347763e01278b08fae6a7d5d95efb982233dba8a0208c9c12b3a7a3acf36e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-chinese-jyutping \
ibus-table-jyutping \
locale-ibus-zh-TW;zh-HK"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
