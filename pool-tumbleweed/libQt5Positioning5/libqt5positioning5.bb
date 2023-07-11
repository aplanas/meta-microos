SUMMARY = "Qt 5 Positioning Library"
DESCRIPTION = "The Qt Positioning API gives developers the ability to determine a \
position by using a variety of possible sources, including satellite, \
WiFi, text file, and so on. That information can then be used to, for \
example, determine a position on a map. In addition, satellite \
information can be retrieved and area-based monitoring be performed."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde4"

RPM_NAME = "libQt5Positioning5-5.15.10+kde4-1.1.aarch64.rpm"
RPM_HASH = "8bd23f2d6939b1249cce8ef2e82a4422b598ea6d80919ddd19d0668cbc603d708fb823091f9f00d0e6d6007de1d4cc18cfe9693b9b8a94d4ea0868970ab5fff3"

RPROVIDES:${PN} += "libQt5Positioning.so.5 \
libQt5Positioning5 \
libqtposition-geoclue.so \
libqtposition-geoclue2.so \
libqtposition-positionpoll.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
