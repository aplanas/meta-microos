SUMMARY = "Terminal Emulator based on the VTE Library"
DESCRIPTION = "sakura is a vte-based terminal emulator. It aims to provide a terminal \
emulator that only depends on GTK and VTE. It uses a notebook to allow \
multiple tabs in the same window."
LICENSE = "GPL-2.0-or-later"

PV = "3.8.5"

RPM_NAME = "sakura-3.8.5-1.4.aarch64.rpm"
RPM_HASH = "3e53d040d8fe6c96a20b0c81bbbc47bb60459024bb73acad09c3a4ad35eaaabb3a98b9eb170b90502735e74833ba5202066f1acbcc9a6f66d84a804a7dfe08b0"

RPROVIDES:${PN} += "application() \
application(sakura.desktop) \
sakura \
sakura(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libvte-2.91.so.0()(64bit)"

inherit rpm