SUMMARY = "UDisks module for btrfs"
DESCRIPTION = "This package contains the UDisks module for btrfs support."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.4"

RPM_NAME = "libudisks2-0_btrfs-2.9.4-6.3.aarch64.rpm"
RPM_HASH = "3e6ea8b9b721cd670461c577ecff5aa4c1b726bf0893234fb24ccd5ec6dc15bc2ad7af110da10df847b49d471dacda7ec8841cddef910ba2adbb49ac21d3ed28"

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
