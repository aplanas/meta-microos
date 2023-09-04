SUMMARY = "Kana–Kanji conversion engine"
DESCRIPTION = "A Kana–Kanji conversion engine."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "9100h"

RPM_NAME = "libanthy0-9100h-42.1.aarch64.rpm"
RPM_HASH = "f031657991ba9523164bddaf9e18562c6122f3cb21f69a6052e891302e6fd589d41292195d5a7e45d062e0543b47473e6c4789d4925c3421e36720478de1f724"

RPROVIDES:${PN} += "libanthy.so.0 \
libanthy0 \
libanthydic.so.0 \
libanthyinput.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
