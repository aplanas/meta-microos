SUMMARY = "Library with common classes and functionality used by finance applications"
DESCRIPTION = "libalkimia is a library with common classes and functionality used by finance \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "8.1.1"

RPM_NAME = "alkimia-8.1.1-1.5.aarch64.rpm"
RPM_HASH = "547b46831b818bcd3d90541b1ff757279bb9017bde70cd9b27e181c98e2f78aa896fc6db022833e5ea79156e801fcaef2a9ab2276ee99c0ec9de995d00d8a598"

RPROVIDES:${PN} += "alkimia \
libqmlalkimia.so \
qt5qmlimport-org.kde.alkimia.1"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libalkimia5.so.8 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
