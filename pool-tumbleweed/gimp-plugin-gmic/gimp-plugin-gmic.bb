SUMMARY = "GMIC plugin for gimp"
DESCRIPTION = "This is a plugin for gimp that exposes many of the nice gmic features \
for interactive use in gimp."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.0"

RPM_NAME = "gimp-plugin-gmic-3.3.0-1.1.aarch64.rpm"
RPM_HASH = "cfda54dcc621787c2c35efbf8b5508db743c1bb8bf792bd37074c7996b78e454d60b11a6cec90c2405534845e7966f69b7da51a8341cac360faf511ee5dd73f8"

RPROVIDES:${PN} += "gimp-plugin-gmic \
gmic-gimp"

RDEPENDS:${PN} += "gimp \
gmic-data \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libbabl-0.1.so.0 \
libc.so.6 \
libfftw3-threads.so.3 \
libgcc-s.so.1 \
libgegl-0.4.so.0 \
libgimp-2.0.so.0 \
libgmic.so.3 \
libgobject-2.0.so.0 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
