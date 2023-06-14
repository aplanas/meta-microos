SUMMARY = "Tools from the VTE terminal emulator package"
DESCRIPTION = "VTE is a terminal emulator library that provides a terminal widget for \
use with GTK+ as well as handling of child process and terminal \
emulation settings. \
 \
This package provides tools using VTE."
LICENSE = "LGPL-2.0-only"

PV = "0.72.1"

RPM_NAME = "vte-tools-0.72.1-2.2.aarch64.rpm"
RPM_HASH = "a0b3c9403ad5796364de4efa7fbd76c2fe67cd3ee1d51ce8fd598de6eb11874ff7ce53eb511a67a91ce9d6ad5fe21e4845cb704b47f559b568838eec3dffcb66"

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
