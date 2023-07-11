SUMMARY = "Mobile broadband device plugin for NetworkManager"
DESCRIPTION = "This package contains NetworkManager support for mobile broadband (WWAN) \
devices."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.8"

RPM_NAME = "NetworkManager-wwan-1.42.8-1.1.aarch64.rpm"
RPM_HASH = "2c395b6bce747020b0fbac22b039ad90ee8cec51291fb0f877e9328ea3140ea0f1f840a8c6067fd2feb902e1b33fee71f686bc126e15ba93f953b2ce8164c82d"

RPROVIDES:${PN} += "NetworkManager-wwan \
libnm-device-plugin-wwan.so \
libnm-wwan.so"

RDEPENDS:${PN} += "ModemManager \
NetworkManager \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmm-glib.so.0 \
libsystemd.so.0"

inherit rpm
