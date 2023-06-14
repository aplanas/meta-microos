SUMMARY = "Development files for UDisks"
DESCRIPTION = "This package contains the development files for the library libUDisks2, a \
dynamic library, which provides access to the UDisksd daemon."
LICENSE = "LGPL-2.0-or-later"

PV = "2.9.4"

RPM_NAME = "libudisks2-0-devel-2.9.4-6.3.aarch64.rpm"
RPM_HASH = "19de8eecf1ae2c17c6d4a62267eb3b5ef4469a65276bcfbeb60a968b22b4719b4fad3031a6204ad77be20c8c30d4717a8c2c70367f29e3d010a77b32cb2a3a3c"

RPROVIDES:${PN} += "libudisks2-0-devel \
pkgconfig-udisks2 \
pkgconfig-udisks2-bcache \
pkgconfig-udisks2-btrfs \
pkgconfig-udisks2-lsm \
pkgconfig-udisks2-lvm2 \
pkgconfig-udisks2-zram"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libudisks2-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-udisks2"

inherit rpm
