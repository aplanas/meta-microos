SUMMARY = "USB Topology and Device Viewer"
DESCRIPTION = "USBView is a GTK program that displays the topography of the devices \
that are plugged into the USB on a Linux machine. It also displays \
information on each of the devices. This can be useful to determine if \
a device is working properly."
LICENSE = "GPL-2.0-only"

PV = "3.0"

RPM_NAME = "usbview-3.0-1.7.aarch64.rpm"
RPM_HASH = "a53a8adf1b8763944d4bb16e5bed2937a1d2169f736f09a240b0e50cd20cd9a231baff1f42f888f019dd48b52616692e54d184c1cc65305af27c0863f8e4f29a"

RPROVIDES:${PN} += "usbview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
