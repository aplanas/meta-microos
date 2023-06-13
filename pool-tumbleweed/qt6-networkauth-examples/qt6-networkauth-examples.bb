SUMMARY = "Examples for the qt6-networkauth modules"
DESCRIPTION = "Examples for the qt6-networkauth modules."
LICENSE = "GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-networkauth-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "7b0d52733aa68914651e072422e5e0b6dbe89919eed677a2978a3c4cba3d969f2f549415e5706c2b5adf44676b18ea1b400fb9931fd080bc418962971ba35184"

RPROVIDES:${PN} += "qt6-networkauth-examples \
qt6-networkauth-examples(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6NetworkAuth.so.6()(64bit) \
libQt6NetworkAuth.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
