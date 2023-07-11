SUMMARY = "Tools from the VTE terminal emulator package"
DESCRIPTION = "VTE is a terminal emulator library that provides a terminal widget for \
use with GTK+ as well as handling of child process and terminal \
emulation settings. \
 \
This package provides tools using VTE."
LICENSE = "LGPL-2.0-only"

PV = "0.72.2"

RPM_NAME = "vte-tools-gtk4-0.72.2-1.1.aarch64.rpm"
RPM_HASH = "196eec41a1b0648e5ebb5765f8d0e6e17487a9bb5d06967fd063737e2a90a0cc9bafab9ee0781b584256a79c5b807bb7139c217966e0ca6c46e1598a87b0b4e5"

RPROVIDES:${PN} += "vte-tools-gtk4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0 \
libstdc++.so.6 \
libvte-2.91-gtk4.so.0"

inherit rpm
