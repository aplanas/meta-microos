SUMMARY = "Key-based configuration system"
DESCRIPTION = "dconf is a low-level configuration system. Its main purpose is to \
provide a backend to GSettings on platforms that don't already \
have configuration storage systems."
LICENSE = "LGPL-2.1-or-later"

PV = "0.40.0"

RPM_NAME = "dconf-0.40.0-3.4.aarch64.rpm"
RPM_HASH = "be9f6cef81a831fb145af5484dcaeec3b5ca8cb398de06e81ed708e4551160fb033349b0eee4fc4cee37b43e2fa1c4be3a3058b82e4af7d4439e75dae83bf996"

RPROVIDES:${PN} += "dconf"

RDEPENDS:${PN} += "dbus-1 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdconf.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
