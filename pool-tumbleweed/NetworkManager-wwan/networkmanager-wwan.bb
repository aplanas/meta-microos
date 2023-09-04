SUMMARY = "Mobile broadband device plugin for NetworkManager"
DESCRIPTION = "This package contains NetworkManager support for mobile broadband (WWAN) \
devices."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.44.0"

RPM_NAME = "NetworkManager-wwan-1.44.0-1.1.aarch64.rpm"
RPM_HASH = "c72e10b965475c7fbfc27a316fab650dbed6287d65dec7ef5105da8aa54bd1b14c69339cfc8b2fa44856f34efd48b495787c721f667b036751eaf5a7fc08000e"

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
