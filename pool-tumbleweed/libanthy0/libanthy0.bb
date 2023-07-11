SUMMARY = "Kana–Kanji conversion engine"
DESCRIPTION = "A Kana–Kanji conversion engine."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "9100h"

RPM_NAME = "libanthy0-9100h-41.10.aarch64.rpm"
RPM_HASH = "b27ccd2a5f5b50dd1fdc2aa02987a456c8f3d31fcdffd7958816c50201599b2c640977f0f77ecf97d2ee856cfc39eef571f02c168780524ee146709173aae7cb"

RPROVIDES:${PN} += "libanthy.so.0 \
libanthy0 \
libanthydic.so.0 \
libanthyinput.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
