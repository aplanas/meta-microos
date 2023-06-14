SUMMARY = "Libyui - Qt (graphical) user interface"
DESCRIPTION = "This package contains the Qt (graphical) user interface component \
for libyui."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "libyui-qt16-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "c5c3fc0e658e03ed7c903c5606aad7552ac2b62923fcd7629b938dcb0817c8dec5e19c17a962df0f48158d0a00067000f6e8b3b30c37a2db45db18512efc32c3"

RPROVIDES:${PN} += "libyui-qt \
libyui-qt.so.16 \
libyui-qt16 \
yast2-qt"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libyui.so.16 \
libyui16"

inherit rpm
