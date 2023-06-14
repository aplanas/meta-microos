SUMMARY = "Library with common classes and functionality used by finance applications"
DESCRIPTION = "libalkimia is a library with common classes and functionality used by finance \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "8.1.1"

RPM_NAME = "alkimia-8.1.1-1.4.aarch64.rpm"
RPM_HASH = "45f72ee213a58cb477499b85ef4409c1f9b7b039bfc6ac36b133b17f6afe04f0bd9103009c594f871ce6612d4d4b9e0c146eb6182c6268cfcf6610cfcf33c14f"

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
