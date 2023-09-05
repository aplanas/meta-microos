SUMMARY = "User interface widgets for text autocorrection library"
DESCRIPTION = "This package provides a library with UI elements to build widgets \
for text autocorrection."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "libKF5TextAutoCorrectionWidgets1-1.4.1-1.1.aarch64.rpm"
RPM_HASH = "83f0e56cab5105e0bad41e10e77fc4deebfb11e4a88d8f4fcefb55c74598368815d9187dcb2914ca9ac2313fa90bae2268208a7be7bd95889eac9eaeb98384bc"

RPROVIDES:${PN} += "libKF5TextAutoCorrectionWidgets.so.1 \
libKF5TextAutoCorrectionWidgets1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libKF5TextAddonsWidgets.so.1 \
libKF5TextAutoCorrectionCore.so.1 \
libKF5TextAutoCorrectionCore1 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
