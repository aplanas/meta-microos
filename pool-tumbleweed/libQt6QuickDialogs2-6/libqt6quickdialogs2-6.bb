SUMMARY = "Qt 6 QuickDialogs2 library"
DESCRIPTION = "The Qt 6 QuickDialogs2 library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QuickDialogs2-6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "9a4aef77b210553a028f2dd33d04c6de4cfbe19dd0a0ec1a8f7f18d62d69f002a5359b181f19c380e933c02b6544ffdaebdca3b1c6737ad0b37b773ccdcc9f80"

RPROVIDES:${PN} += "libQt6QuickDialogs2-6 \
libQt6QuickDialogs2.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickDialogs2QuickImpl.so.6 \
libQt6QuickDialogs2Utils.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
