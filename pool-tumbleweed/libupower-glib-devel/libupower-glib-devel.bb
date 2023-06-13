SUMMARY = "Power Device Enumeration Framework - Development Files"
DESCRIPTION = "UPower is an abstraction for enumerating power devices, listening to \
device events and querying history and statistics. Any application or \
service on the system can access the org.freedesktop.UPower service \
via the system message bus. Some operations (such as suspending the \
system) are restricted using PolicyKit."
LICENSE = "GPL-2.0-or-later"

PV = "1.90.0"

RPM_NAME = "libupower-glib-devel-1.90.0-1.4.aarch64.rpm"
RPM_HASH = "ce99857df33995972454600f95b39878cee1219eaf9fc331e9d1eda25286480ebede8745f974d9fdc2136cae60f9b633b9e64c87056cbd32d73645659ed94abf"

RPROVIDES:${PN} += "libupower-glib-devel \
libupower-glib-devel(aarch-64) \
pkgconfig(upower-glib) \
upower-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libupower-glib3 \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
typelib-1_0-UpowerGlib-1_0"

inherit rpm
