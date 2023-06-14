SUMMARY = "Libyui - Qt package selector"
DESCRIPTION = "This package contains the Qt package selector component for libyui."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "libyui-qt-pkg16-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "82226544be122118d059b48454ebb28b95ef4cf7f2a8897da0dec0fb16e8aa54d09c0f4f59127271a57345b43e446de4da70f9eb5b8cd03c24c6db1ec360307c"

RPROVIDES:${PN} += "libyui-pkg \
libyui-qt-pkg \
libyui-qt-pkg.so.16 \
libyui-qt-pkg16 \
yast2-qt-pkg"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libyui-qt16 \
libyui.so.16 \
libyui16 \
libzypp \
libzypp.so.1722"

inherit rpm
