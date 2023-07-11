SUMMARY = "Development files for UDisks"
DESCRIPTION = "This package contains the development files for the library libUDisks2, a \
dynamic library, which provides access to the UDisksd daemon."
LICENSE = "LGPL-2.0-or-later"

PV = "2.9.4"

RPM_NAME = "libudisks2-0-devel-2.9.4-6.4.aarch64.rpm"
RPM_HASH = "52e3ec0f6b4a1bdae4fc39b293b03d8ec48ec45c826fc6bca8d2227c52d3f2e807357f94c9cd49ac43ee5e29572937911457c330bb710c68a8fa4e4c6b959da6"

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
