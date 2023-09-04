SUMMARY = "Power Device Enumeration Framework"
DESCRIPTION = "UPower is an abstraction for enumerating power devices, listening to \
device events and querying history and statistics. Any application or \
service on the system can access the org.freedesktop.UPower service \
via the system message bus. Some operations (such as suspending the \
system) are restricted using PolicyKit."
LICENSE = "GPL-2.0-or-later"

PV = "1.90.2"

RPM_NAME = "upower-1.90.2-1.1.aarch64.rpm"
RPM_HASH = "c545c496f2caaaccea2dfc849cae7fb85a19d02351e4a28793ca634d7c4792cc883ff04e5ee1b032c25f91ba9b8d92cef7bafb913db5cbedb770053d44451536"

RPROVIDES:${PN} += "config-upower \
upower"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libimobiledevice-1.0.so.6 \
libplist-2.0.so.4 \
libupower-glib.so.3 \
systemd"

inherit rpm
