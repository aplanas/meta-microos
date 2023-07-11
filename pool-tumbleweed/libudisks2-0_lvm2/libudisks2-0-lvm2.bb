SUMMARY = "UDisks module for LVM2"
DESCRIPTION = "This package contains the UDisks module for LVM2 support."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.4"

RPM_NAME = "libudisks2-0_lvm2-2.9.4-6.4.aarch64.rpm"
RPM_HASH = "e1644db7dd50360c35e5c4eda0103785f266d9e007fcb75779ea245a6c625414725b865dc5783707e005031b9c9cbb260bb233a0f253ca2c346147a7e6f17fdb"

RPROVIDES:${PN} += "libudisks2-0-lvm2 \
libudisks2-lvm2.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblockdev-lvm \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libudisks2-0 \
lvm2"

inherit rpm
