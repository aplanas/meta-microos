SUMMARY = "Shared library for libportal"
DESCRIPTION = "A GIO-style async APIs for most Flatpak portals. \
This package contains the shared library of libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "libportal-qt5-1-0.6-1.8.aarch64.rpm"
RPM_HASH = "407b1db38eb150b32c243854d07a395ac5aa49c56b1c90a37341b28039fd29ceddc4e8b154e94d31fd6b40eed20b1fdc71dbf6ff028d715c9168101ef7f04875"

RPROVIDES:${PN} += "libportal-qt5-1 \
libportal-qt5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libportal.so.1 \
libstdc++.so.6"

inherit rpm
