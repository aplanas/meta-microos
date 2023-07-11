SUMMARY = "UDisks module for btrfs"
DESCRIPTION = "This package contains the UDisks module for btrfs support."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.4"

RPM_NAME = "libudisks2-0_btrfs-2.9.4-6.4.aarch64.rpm"
RPM_HASH = "e6d51744cb50894d35afb6114ac5d6a244f9b7b1beb2ab12c19b0cf92fbfd22e77a8161af9179e61af8b990b291682a2ffaea5edab2ef06ddb0f4910bb18960c"

RPROVIDES:${PN} += "libudisks2-0-btrfs \
libudisks2-btrfs.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblockdev-btrfs \
libblockdev.so.2 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libudisks2-0"

inherit rpm
