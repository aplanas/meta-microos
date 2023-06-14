SUMMARY = "Shared library for libportal"
DESCRIPTION = "A GIO-style async APIs for most Flatpak portals. \
This package contains the shared library of libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "libportal-qt5-1-0.6-1.7.aarch64.rpm"
RPM_HASH = "45852ca02e5c8d4c3202405e26694317427d28adceff1025fdf0ae429b5853f1c94186b00489c88e7e7db5760c88eafb0dc1eda85541c6c2aaf56ac61d8dd31e"

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
