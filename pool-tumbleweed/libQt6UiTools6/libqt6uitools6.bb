SUMMARY = "Qt 6 UiTools library"
DESCRIPTION = "This package contains the Qt 6 UiTools library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "libQt6UiTools6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "37b1016140753b706f4608128132b3f5238a36e62f089c1b9aa809d491c735a1b3c0b983cc107409863bf0e18c8f5abef2a13faa99ac55dabe3defaff3e6fa97"

RPROVIDES:${PN} += "libQt6UiTools.so.6 \
libQt6UiTools6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
