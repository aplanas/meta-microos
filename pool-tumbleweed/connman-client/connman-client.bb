SUMMARY = "Client script for connman"
DESCRIPTION = "Provides client interface for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-client-1.41-4.8.aarch64.rpm"
RPM_HASH = "5e95234c2693941b7d79be5ce051271ae69f7ed46c0c3eebe816d7038697ac070a10abc45ec8efea31b8b034b6f705b042f4a34f70335023302953552f92aad6"

RPROVIDES:${PN} += "connman-client"

RDEPENDS:${PN} += "connman \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0 \
libreadline.so.8"

inherit rpm
