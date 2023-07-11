SUMMARY = "Power Device Enumeration Framework - Development Files"
DESCRIPTION = "UPower is an abstraction for enumerating power devices, listening to \
device events and querying history and statistics. Any application or \
service on the system can access the org.freedesktop.UPower service \
via the system message bus. Some operations (such as suspending the \
system) are restricted using PolicyKit."
LICENSE = "GPL-2.0-or-later"

PV = "1.90.1"

RPM_NAME = "libupower-glib-devel-1.90.1-1.1.aarch64.rpm"
RPM_HASH = "84d18d429271518bc4541d0bd524987d84de7cbd878a1266d2e2ff5489d2513bf072f3ce7a3ab8db218027c80d37a429f1483584d8845d69e2044d9c670fa21d"

RPROVIDES:${PN} += "libupower-glib-devel \
pkgconfig-upower-glib \
upower-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libupower-glib3 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
typelib-1-0-UpowerGlib-1-0"

inherit rpm
