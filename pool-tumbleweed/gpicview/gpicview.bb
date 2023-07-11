SUMMARY = "LXDE Photo Viewer"
DESCRIPTION = "An extremely fast, lightweight, yet feature-rich photo viewer. \
This software is part of the LXDE Desktop Environment."
LICENSE = "GPL-2.0-only"

PV = "0.2.5"

RPM_NAME = "gpicview-0.2.5-2.17.aarch64.rpm"
RPM_HASH = "1137790fc92fad3b2cbf4f4a4d5a6192daed8135da3d40dd88ef533f44df473a95afc1861d1079f7dc2c91a50e98800485d7a5008dee29dd043b3daa9b5e90c8"

RPROVIDES:${PN} += "gpicview"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libjpeg.so.8 \
libm.so.6"

inherit rpm
