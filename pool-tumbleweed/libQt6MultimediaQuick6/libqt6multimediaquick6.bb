SUMMARY = "Qt 6 MultimediaQuick library"
DESCRIPTION = "The Qt 6 MultimediaQuick library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6MultimediaQuick6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "31e9baffc3b7edab8dc628be295d9636df4b72b5322108ed9fe74f51e0b1f09c7c7559f0ff8dbb738bf410ee45bd47acfb1bbb66e9d04dc7a9cffc98a401b854"

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
