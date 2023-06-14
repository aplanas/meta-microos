SUMMARY = "Qt 6 Multimedia library"
DESCRIPTION = "The Qt 6 Multimedia library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Multimedia6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "eda1bc62870beff03e73e7e782b114f5967fa5183701c62b384520668dcb6773c2d8b2578637a934b87834d053aa6bc8bfaa5e29e4e84d4fb806bd796f5e8bb7"

RPROVIDES:${PN} += "libQt6Multimedia.so.6 \
libQt6Multimedia6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libm.so.6 \
libpulse.so.0 \
libstdc++.so.6"

inherit rpm
