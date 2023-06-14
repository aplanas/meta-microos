SUMMARY = "Scripting bridge for programs"
DESCRIPTION = "Kross is a scripting bridge to embed scripting functionality \
into an application. It supports QtScript as a scripting interpreter backend."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kross-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "f90b4ad1f61e985ddf7885161620e527874dd5251b00a0cfba034dc255f5096b7ea9da98548394538899f7377304ba75fb665f15d143d8011aa05c53b1f4d7ea"

RPROVIDES:${PN} += "kross \
libKF5KrossCore.so.5 \
libKF5KrossUi.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Parts.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Script.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
