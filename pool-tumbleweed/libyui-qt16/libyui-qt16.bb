SUMMARY = "Libyui - Qt (graphical) user interface"
DESCRIPTION = "This package contains the Qt (graphical) user interface component \
for libyui."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "libyui-qt16-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "c5c3fc0e658e03ed7c903c5606aad7552ac2b62923fcd7629b938dcb0817c8dec5e19c17a962df0f48158d0a00067000f6e8b3b30c37a2db45db18512efc32c3"

RPROVIDES:${PN} += "libyui-qt \
libyui-qt.so.16()(64bit) \
libyui-qt16 \
libyui-qt16(aarch-64) \
yast2-qt"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libyui.so.16()(64bit) \
libyui16"

inherit rpm
