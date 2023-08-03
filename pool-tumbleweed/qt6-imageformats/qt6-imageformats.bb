SUMMARY = "Qt 6 ImageFormat Plugins"
DESCRIPTION = "Plugins for additional image formats: TIFF, MNG, TGA, WEBP, WBMP"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-imageformats-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "8c12f97743b819b21e6dee912fef57074d890db0bd9d78b10fdbb7de07fec9b1fe79d01015d3da5837b34ac34be1bfcfffe1b648733979d70c6182a944973deb"

RPROVIDES:${PN} += "libqicns.so \
libqmng.so \
libqtga.so \
libqtiff.so \
libqwbmp.so \
libqwebp.so \
qt6-imageformats"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libm.so.6 \
libmng.so.2 \
libstdc++.so.6 \
libtiff.so.6 \
libwebp.so.7 \
libwebpdemux.so.2 \
libwebpmux.so.3"

inherit rpm
