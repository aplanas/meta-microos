SUMMARY = "Qt 6 QuickTimeline library"
DESCRIPTION = "The Qt 6 QuickTimeline library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6QuickTimeline6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "99d6284d444490859bb7c176cd82d5092d2dc5eec741fbce936f9269fa86bcb2fbbfd15ef01fc5696abe28566d79a2cf7f10f03979d22c9e86508989ef40e5d6"

RPROVIDES:${PN} += "libQt6QuickTimeline.so.6 \
libQt6QuickTimeline6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
