SUMMARY = "Qt 6 ImageFormat Plugins"
DESCRIPTION = "Plugins for additional image formats: TIFF, MNG, TGA, WEBP, WBMP"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-imageformats-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "1b87b4352c6036027c66314785865e86e9a01cad1fe7eed86ba472987751d1bbd8e6513481a71b5e2af17d51183878c5ca2bc401c87f10eb47312436549628dd"

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
