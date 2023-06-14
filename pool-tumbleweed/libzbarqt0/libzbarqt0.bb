SUMMARY = "ZBar Qt bindings"
DESCRIPTION = "This package provides ZBar Qt bindings."
LICENSE = "LGPL-2.0-or-later"

PV = "0.23.90"

RPM_NAME = "libzbarqt0-0.23.90-3.1.aarch64.rpm"
RPM_HASH = "feb5600c1b55334da41c599ae8a08926ab41a86e1983dc3a1e0a3469d3fe79a1ba9bbf3c61dc0cc43dabd919f9a6efca46f0db7ebddb51000d151ddfaeb63f01"

RPROVIDES:${PN} += "libzbarqt.so.0 \
libzbarqt0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libzbar.so.0"

inherit rpm
