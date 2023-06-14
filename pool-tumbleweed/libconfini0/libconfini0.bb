SUMMARY = "INI file parser library"
DESCRIPTION = "libconfini is a INI file parser library written in C."
LICENSE = "GPL-3.0-or-later"

PV = "1.16.4"

RPM_NAME = "libconfini0-1.16.4-1.4.aarch64.rpm"
RPM_HASH = "6c5663ac3065b810694cec47fc0c5f60d2275100a1251594ac7bd8eb6417a92746ea46a12154936d100735d005051adf9bef314fb7ad6dd0ccf4481a0298fde7"

RPROVIDES:${PN} += "libconfini.so.0 \
libconfini0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
