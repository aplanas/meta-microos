SUMMARY = "GTK3 IM Module for UIM"
DESCRIPTION = "Contains GTK+3.0 IM module for uim"
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & (BSD-3-Clause | LGPL-2.0-only)"

PV = "1.8.8"

RPM_NAME = "uim-gtk3-1.8.8-9.10.aarch64.rpm"
RPM_HASH = "c2ae15e35d23f30da552a293b78e81b241a0017de786ce7ade1d05f04b4f451f17cd845a9a4483899b1c552636cb3786b314c4f4d0bba612eb22e2110e020b0c"

RPROVIDES:${PN} += "uim-gtk3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libuim-custom.so.2 \
libuim-scm.so.0 \
libuim.so.8 \
uim"

inherit rpm
