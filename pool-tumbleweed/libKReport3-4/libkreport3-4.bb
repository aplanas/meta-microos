SUMMARY = "The library for the Report Creation and generation Framework"
DESCRIPTION = "The main library for the Report creation and generation framework"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "libKReport3-4-3.2.0-4.11.aarch64.rpm"
RPM_HASH = "f4a46e96e6462b108c3fc6d95801503cddce621dd910619d65a9943432e642788af795b0258fb2c742c8aa1eeb002a8e11d12362352674405a3835703c34dc55"

RPROVIDES:${PN} += "libKReport3-4 \
libKReport3.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
kreport \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5WidgetsAddons.so.5 \
libKPropertyCore3.so.4 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
