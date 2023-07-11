SUMMARY = "Introspection bindings for libgusb, a GObject-based wrapper for libusb1"
DESCRIPTION = "GUsb is a GObject wrapper for libusb1 that makes it easy to do \
asynchronous control, bulk and interrupt transfers with proper \
cancellation and integration into a mainloop."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.10"

RPM_NAME = "typelib-1_0-GUsb-1_0-0.3.10-2.5.aarch64.rpm"
RPM_HASH = "cf26d127b9cc1e503a1695c65780a10182310e84d4455e0ef24f1f226287ba9f6fe0b422c76ad9b40e8dbda2f8547f2b3a1444f13052c8b459c4b5db8d6ec2da"

RPROVIDES:${PN} += "typelib-1-0-GUsb-1-0 \
typelib-GUsb"

RDEPENDS:${PN} += "libgusb.so.2 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
