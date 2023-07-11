SUMMARY = "GMIC plugin for krita"
DESCRIPTION = "This is a plugin for krita to provide gmic features."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.6"

RPM_NAME = "krita-plugin-gmic-3.2.6-1.1.aarch64.rpm"
RPM_HASH = "6c5b3cc9749830382777a41c46cfd7d2300a4e652c66d85bbca649e6e9e68b262cc8dca351cac0eb838a861147958e28e8bf95ca775cf41016654903e84d6cca"

RPROVIDES:${PN} += "krita-plugin-gmic"

RDEPENDS:${PN} += "gmic-data \
krita \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libc.so.6 \
libfftw3-threads.so.3 \
libgcc-s.so.1 \
libgmic.so.3 \
libgomp.so.1 \
libkritaqmicinterface.so.18 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
