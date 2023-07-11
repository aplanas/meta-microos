SUMMARY = "Library with common API for various MATE modules"
DESCRIPTION = "This package contains the library with common API for various \
MATE modules."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.26.1"

RPM_NAME = "mate-desktop-1.26.1-1.2.aarch64.rpm"
RPM_HASH = "05b3b44eaa97ecab7e5980ab710d65a9a96942f0ec53a82d85c28508253e5fd15f37c2b7f129c3c8eb7fff55b346bce14348217f5aa636f981ce97744177848d"

RPROVIDES:${PN} += "mate-desktop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmate-desktop-2.so.17 \
xdg-user-dirs"

inherit rpm
