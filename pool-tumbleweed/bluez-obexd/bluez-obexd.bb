SUMMARY = "Object Exchange daemon for sharing content"
DESCRIPTION = "Object Exchange daemon for sharing content."
LICENSE = "GPL-2.0-or-later"

PV = "5.68"

RPM_NAME = "bluez-obexd-5.68-4.2.aarch64.rpm"
RPM_HASH = "d2460fdcbb4384c233e4afb57801c5d9aad24182a280beab57ad555ac58100233717687d76949de481b596b79d9befe3f10e1ba4a79600510783a06498a3b958"

RPROVIDES:${PN} += "bluez-obexd"

RDEPENDS:${PN} += "/usr/bin/sh \
bluez \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0 \
libicalvcal.so.3"

inherit rpm
