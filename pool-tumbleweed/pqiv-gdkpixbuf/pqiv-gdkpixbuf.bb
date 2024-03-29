SUMMARY = "Backend gdkpixbuf for pqiv"
DESCRIPTION = "Backend gdkpixbuf for pqiv"
LICENSE = "GPL-3.0-or-later"

PV = "2.12"

RPM_NAME = "pqiv-gdkpixbuf-2.12-1.4.aarch64.rpm"
RPM_HASH = "14c25fe47a0cf97c1d771355b051cc84bc4c1458604b4d9a8a4dad0e89e2432c2bbf0047d1e4538c7c123ac6011dba0effd77047b1434efbb629b09d8535e8ee"

RPROVIDES:${PN} += "pqiv-gdkpixbuf"

RDEPENDS:${PN} += "libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
pqiv"

inherit rpm
