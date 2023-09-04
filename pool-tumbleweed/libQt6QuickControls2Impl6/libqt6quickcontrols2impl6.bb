SUMMARY = "Qt 6 QuickControls2Impl library"
DESCRIPTION = "The Qt 6 QuickControls2Impl library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6QuickControls2Impl6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "ba388ec7c0edade8a268ef956d9db4074504b6f4db9331b514413c5fe6d6ee954d3e60b4e1b614cd914a90cae064a98ffd0c601446d1b3599470dbb7e7648913"

RPROVIDES:${PN} += "libQt6QuickControls2Impl.so.6 \
libQt6QuickControls2Impl6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickTemplates2.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
