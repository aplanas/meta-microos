SUMMARY = "UDisks module for LVM2"
DESCRIPTION = "This package contains the UDisks module for LVM2 support."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.4"

RPM_NAME = "libudisks2-0_lvm2-2.9.4-6.3.aarch64.rpm"
RPM_HASH = "4ea96f1577c3ce98a04fd87cb9f65946de48cbf69fed1d814769d294f0a0d0d4bd035c45c37723836e4519d30cb63811b64ceb96d6d5c3ade602a8e88ff44cd7"

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
