SUMMARY = "Qt 6 MultimediaQuick library"
DESCRIPTION = "The Qt 6 MultimediaQuick library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6MultimediaQuick6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "ffc16429c7a1100b9434a35a069bd06637a4c34fc3b88da34c82da489f02ff4964f19ef80f4d0710853e2acbdda39d4f2ade98d6266141bca9ea9044c9b993cd"

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
