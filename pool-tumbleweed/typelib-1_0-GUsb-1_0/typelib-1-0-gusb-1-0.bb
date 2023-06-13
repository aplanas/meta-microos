SUMMARY = "Introspection bindings for libgusb, a GObject-based wrapper for libusb1"
DESCRIPTION = "GUsb is a GObject wrapper for libusb1 that makes it easy to do \
asynchronous control, bulk and interrupt transfers with proper \
cancellation and integration into a mainloop."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.10"

RPM_NAME = "typelib-1_0-GUsb-1_0-0.3.10-2.4.aarch64.rpm"
RPM_HASH = "b3b438896d7b5e4c47b258f6f2a6ce04a861a74e117f90a79f58204be590137eab1838506897882af1b9f321cf6f731ccb9e8cdd09725e044420ebb9d3bbcfdd"

RPROVIDES:${PN} += "typelib(GUsb) \
typelib-1_0-GUsb-1_0 \
typelib-1_0-GUsb-1_0(aarch-64)"

RDEPENDS:${PN} += "libgusb.so.2()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
