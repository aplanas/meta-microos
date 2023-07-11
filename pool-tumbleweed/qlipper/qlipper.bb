SUMMARY = "Clipboard history applet"
DESCRIPTION = "A clipboard history applet."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.2"

RPM_NAME = "qlipper-5.1.2-1.13.aarch64.rpm"
RPM_HASH = "8d12d8bc3a8c25e8af6f9490fd07e23f0bef808e31fbc9e71889551a5bf2803517e84211ece92c0b5360d6176c65e8c22d032e4098ed6a275448e83eea84a220"

RPROVIDES:${PN} += "qlipper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
