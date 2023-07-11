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

RPM_NAME = "libusbmuxd-devel-2.0.2-1.10.aarch64.rpm"
RPM_HASH = "6fb123613277952f4cab21dbee31f6398f491bd190c0259dac36bf8b1a243bef0e80a0aaa3fc87a0f10cf39d242adc859a53d0acdc8260a74b487aa50a737b38"

RPROVIDES:${PN} += "libusbmuxd-devel \
pkgconfig-libusbmuxd-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libusbmuxd-2-0-6 \
pkgconfig-libplist-2.0"

inherit rpm
