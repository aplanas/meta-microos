SUMMARY = "Library Package for Keybinder"
DESCRIPTION = "Library for registering global keyboard shortcuts. Keybinder \
works with GTK-based applications using the X Window System. \
 \
The library contains: \
- A C library, libkeybinder \
- Gobject-Introspection bindings"
LICENSE = "MIT & X11"

PV = "0.3.2"

RPM_NAME = "libkeybinder-3_0-0-0.3.2-1.25.aarch64.rpm"
RPM_HASH = "8ed18085b77d70ae0c872d3c175ce06f4e9f838412e8ff759e53d592fa5d5548c15219cb5004cc38af320982aa33e71cedbb5395ba4f02896a73628b5ea86fb4"

RPROVIDES:${PN} += "libkeybinder-3-0-0 \
libkeybinder-3.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
