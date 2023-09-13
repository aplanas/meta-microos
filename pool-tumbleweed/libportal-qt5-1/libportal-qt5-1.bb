SUMMARY = "Shared library for libportal"
DESCRIPTION = "A GIO-style async APIs for most Flatpak portals. \
This package contains the shared library of libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7"

RPM_NAME = "libportal-qt5-1-0.7-1.1.aarch64.rpm"
RPM_HASH = "beb7de978c0540ae25c6e6a89dfe7d69a855e2af0437b320556b0b4a7371a0eb777fda291d84368b0ad7a8301c94a28466109c6c08a5236701a6d1f29fde02a7"

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
