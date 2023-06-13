SUMMARY = "Qt6 WebEngineWidgets library"
DESCRIPTION = "The Qt6 WebEngineWidgets library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6WebEngineWidgets6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "6c5d53f9c603f88a6db94ca02aca89d5809384de4c0ba5630858a4deb29dd4409bb1fc512711744d05d03cc621c4cead50697248e7b32559ea2c210a40962453"

RPROVIDES:${PN} += "libQt6WebEngineWidgets.so.6()(64bit) \
libQt6WebEngineWidgets.so.6(Qt_6)(64bit) \
libQt6WebEngineWidgets6 \
libQt6WebEngineWidgets6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6PrintSupport.so.6()(64bit) \
libQt6PrintSupport.so.6(Qt_6)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6)(64bit) \
libQt6QuickWidgets.so.6()(64bit) \
libQt6QuickWidgets.so.6(Qt_6)(64bit) \
libQt6WebEngineCore.so.6()(64bit) \
libQt6WebEngineCore.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
