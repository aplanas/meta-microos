SUMMARY = "Tools from the VTE terminal emulator package"
DESCRIPTION = "VTE is a terminal emulator library that provides a terminal widget for \
use with GTK+ as well as handling of child process and terminal \
emulation settings. \
 \
This package provides tools using VTE."
LICENSE = "LGPL-2.0-only"

PV = "0.72.2"

RPM_NAME = "vte-tools-0.72.2-1.1.aarch64.rpm"
RPM_HASH = "709c8204dd5bf473253b9cf7415bbeed827bc92a5610061d2ed634a503fd198fa45317c0b48811a1b75c2079f7922e7fab08a6e94faba7a6922c4615450779ed"

RPROVIDES:${PN} += "vte-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libstdc++.so.6 \
libvte-2.91.so.0"

inherit rpm
