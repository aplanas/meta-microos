SUMMARY = "Get notifications from the phone or tablet"
DESCRIPTION = "Nuntius is a daemon that connects to another Nuntius app running on \
a phone or a tablet and proxies the notifications using Bluetooth."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "nuntius-0.2.0-3.15.aarch64.rpm"
RPM_HASH = "2af5759eb8bd86bab6fde9acd9d7b8c2d2ad931d7a1be3edc78e4e0567e277dfffc439c7133c7882eda950e919af30fa0c7b97702c74719ef0ae4542f603b6b1"

RPROVIDES:${PN} += "nuntius"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0"

inherit rpm
