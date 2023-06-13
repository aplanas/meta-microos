SUMMARY = "Development files for libusbmuxd"
DESCRIPTION = "'usbmuxd' stands for 'USB multiplexing daemon'. This daemon is in charge of \
multiplexing connections over USB to an iPhone or iPod touch. To users, it means \
you can sync your music, contacts, photos, etc. over USB. To developers, it \
means you can connect to any listening localhost socket on the device. usbmuxd \
is not used for tethering data transfer, which uses a dedicated USB interface as \
a virtual network device. \
 \
The libusbmuxd-devel package contains libraries and header files for \
developing applications that use libusbmuxd."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "2.0.2"

RPM_NAME = "libusbmuxd-devel-2.0.2-1.9.aarch64.rpm"
RPM_HASH = "7c82359aab1927892ebfb5280e3f376cb12fc2e07da6f1cf9fba0038ac1a340e0b38cf1d572ae5e28a81faadce77a65a6c5ed7aed1c9b75d7fd2548e12fdf508"

RPROVIDES:${PN} += "libusbmuxd-devel \
libusbmuxd-devel(aarch-64) \
pkgconfig(libusbmuxd-2.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libusbmuxd-2_0-6 \
pkgconfig(libplist-2.0)"

inherit rpm
