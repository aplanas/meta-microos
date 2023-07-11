SUMMARY = "A client library to multiplex connections from and to iOS devices"
DESCRIPTION = "'usbmuxd' stands for 'USB multiplexing daemon'. This daemon is in charge of \
multiplexing connections over USB to an iPhone or iPod touch. To users, it means \
you can sync your music, contacts, photos, etc. over USB. To developers, it \
means you can connect to any listening localhost socket on the device. usbmuxd \
is not used for tethering data transfer, which uses a dedicated USB interface as \
a virtual network device. \
 \
This package contains the usbmuxd communication interface library 'libusbmuxd'."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "2.0.2"

RPM_NAME = "libusbmuxd-2_0-6-2.0.2-1.10.aarch64.rpm"
RPM_HASH = "aa14755c22251c7b1e87c26c3f24017cb006964e23d80992a50b8a084ba2fb18e3bc86414f4d6f5df716f44b8557b391a48b8666c3925a7f8dca67ed5a0c19da"

RPROVIDES:${PN} += "libusbmuxd-2-0-6 \
libusbmuxd-2.0.so.6 \
libusbmuxd6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libplist-2.0.so.4"

inherit rpm
