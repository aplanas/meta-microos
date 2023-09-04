SUMMARY = "Power Device Enumeration Framework - Development Files"
DESCRIPTION = "UPower is an abstraction for enumerating power devices, listening to \
device events and querying history and statistics. Any application or \
service on the system can access the org.freedesktop.UPower service \
via the system message bus. Some operations (such as suspending the \
system) are restricted using PolicyKit."
LICENSE = "GPL-2.0-or-later"

PV = "1.90.2"

RPM_NAME = "libupower-glib-devel-1.90.2-1.1.aarch64.rpm"
RPM_HASH = "d78bd06b67d57f92a399fe9e1fda647ac660ddca03ea0109db2e4aa155168737ec70c7278ae0f3f807aebfe6663a86d78677fc17e9fd95f9fa3a342ca9b37a92"

RPROVIDES:${PN} += "libupower-glib-devel \
pkgconfig-upower-glib \
upower-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libupower-glib3 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
typelib-1-0-UpowerGlib-1-0"

inherit rpm
