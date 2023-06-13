SUMMARY = "Libyui - Qt package selector"
DESCRIPTION = "This package contains the Qt package selector component for libyui."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "libyui-qt-pkg16-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "82226544be122118d059b48454ebb28b95ef4cf7f2a8897da0dec0fb16e8aa54d09c0f4f59127271a57345b43e446de4da70f9eb5b8cd03c24c6db1ec360307c"

RPROVIDES:${PN} += "libyui-qt-pkg \
libyui-qt-pkg.so.16()(64bit) \
libyui-qt-pkg16 \
libyui-qt-pkg16(aarch-64) \
libyui_pkg \
yast2-qt-pkg"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Svg5 \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libyui-qt16 \
libyui.so.16()(64bit) \
libyui16 \
libzypp \
libzypp.so.1722()(64bit) \
libzypp.so.1722(ZYPP_plain)(64bit)"

inherit rpm
