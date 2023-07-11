SUMMARY = "MATE module API library development files"
DESCRIPTION = "This package contains the library with common API for various MATE modules."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.26.1"

RPM_NAME = "mate-desktop-devel-1.26.1-1.2.aarch64.rpm"
RPM_HASH = "45760806e4a7c64101cf03af8a65df85f99f63ce72a8150d8162527856b47b786cbc78a7084a947e8376816e1e13d1365649112ac789c5f19c72f6907784e5c6"

RPROVIDES:${PN} += "mate-desktop-devel \
pkgconfig-mate-desktop-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmate-desktop-2-17 \
pkgconfig-dconf \
pkgconfig-gtk+-3.0 \
pkgconfig-libstartup-notification-1.0"

inherit rpm
