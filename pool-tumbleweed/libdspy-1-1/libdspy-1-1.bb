SUMMARY = "Shared library for d-spy"
DESCRIPTION = "Shared library for d-spy."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "libdspy-1-1-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "70c4b565929ba8d44f3beb2657472fe37596069b78ea2db1f193d2dade1dc4699f899ea7c7390789c20b78ede1e78c2bcb265c60353ebb3c046c77db6b8b95a2"

RPROVIDES:${PN} += "libdspy-1-1 \
libdspy-1-1(aarch-64) \
libdspy-1.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libadwaita-1.so.0()(64bit) \
libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-4.so.1()(64bit)"

inherit rpm
