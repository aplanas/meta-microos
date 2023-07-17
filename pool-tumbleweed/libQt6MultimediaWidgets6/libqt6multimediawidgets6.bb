SUMMARY = "Qt 6 MultimediaWidgets library"
DESCRIPTION = "The Qt 6 MultimediaWidgets library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6MultimediaWidgets6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "505ec051c35736b795e216a2260a5eff2cd1f7a125ad822e4f865a8087962817ac2e1d0b0f3959241670477a343be34ae2776eb2dc995963a54ddccf84c3aa42"

RPROVIDES:${PN} += "libQt6MultimediaWidgets.so.6 \
libQt6MultimediaWidgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
