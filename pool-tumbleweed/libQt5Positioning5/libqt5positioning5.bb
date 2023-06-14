SUMMARY = "Qt 5 Positioning Library"
DESCRIPTION = "The Qt Positioning API gives developers the ability to determine a \
position by using a variety of possible sources, including satellite, \
WiFi, text file, and so on. That information can then be used to, for \
example, determine a position on a map. In addition, satellite \
information can be retrieved and area-based monitoring be performed."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde5"

RPM_NAME = "libQt5Positioning5-5.15.9+kde5-1.2.aarch64.rpm"
RPM_HASH = "ed0610962a55d937ae78eacabff56a242fb1796ba2284a59d5d75500cbd6b21a3d9191fb9080fb7e49b2f820947cd7962ba9e29b0d18a17570f9ef057d8bd657"

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
