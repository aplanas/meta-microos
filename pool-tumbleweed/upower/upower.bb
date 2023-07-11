SUMMARY = "Power Device Enumeration Framework"
DESCRIPTION = "UPower is an abstraction for enumerating power devices, listening to \
device events and querying history and statistics. Any application or \
service on the system can access the org.freedesktop.UPower service \
via the system message bus. Some operations (such as suspending the \
system) are restricted using PolicyKit."
LICENSE = "GPL-2.0-or-later"

PV = "1.90.1"

RPM_NAME = "upower-1.90.1-1.1.aarch64.rpm"
RPM_HASH = "dc6fa761a2f671379688f68e26e53c885263d8c6861cc9c3617c85faee2c99b3d2c608b0834df25a6c6e16e04f9f6c397a4ad4747b48e456af489d4a8ed3157b"

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
