SUMMARY = "Terminal Emulator based on the VTE Library"
DESCRIPTION = "sakura is a vte-based terminal emulator. It aims to provide a terminal \
emulator that only depends on GTK and VTE. It uses a notebook to allow \
multiple tabs in the same window."
LICENSE = "GPL-2.0-or-later"

PV = "3.8.7"

RPM_NAME = "sakura-3.8.7-1.1.aarch64.rpm"
RPM_HASH = "8a35aafe2595b860758fcae4fa3b5317df5de3cdb8635ad2cd4278a225204462c4d118bce14ff8aa7c84634e15f8100d7ea87960b41f31dde33b962cd0e2bf20"

RPROVIDES:${PN} += "sakura"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libvte-2.91.so.0"

inherit rpm
