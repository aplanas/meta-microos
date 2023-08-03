SUMMARY = "Qt 6 MultimediaQuick library"
DESCRIPTION = "The Qt 6 MultimediaQuick library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6MultimediaQuick6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "8a8932952cdcef90973ea04154a70895d4278f42fa901f5146ef2013293da0f9cca303bc341c6b59ec5d7601fc362a1c0503b6d1a784fceaa1851f51823fc174"

RPROVIDES:${PN} += "libQt6MultimediaQuick.so.6 \
libQt6MultimediaQuick6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
