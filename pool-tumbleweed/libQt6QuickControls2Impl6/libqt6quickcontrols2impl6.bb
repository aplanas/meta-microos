SUMMARY = "Qt 6 QuickControls2Impl library"
DESCRIPTION = "The Qt 6 QuickControls2Impl library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QuickControls2Impl6-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "321de6df0f35307a1260ee5443b52571389ab649560d4702660d1cc74ce092ee6fc35eaaf44bc83983ff88384636d1c0204405e38c166bac296dbe3f6daac2e6"

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
