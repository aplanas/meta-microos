SUMMARY = "Plugin framework for desktop services"
DESCRIPTION = "Provides a plugin framework for handling desktop services. Services can \
be applications or libraries. They can be bound to MIME types or handled by \
application specific code."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kservice-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "b2b4f31fc4d9e26dad69ed956511004c6c52df36d82ab1cc75c7183a0c299add120adbc9f33241b1060edfa908971f804d3f84311b5d65acd4a1de6b520153dd"

RPROVIDES:${PN} += "kservice \
libKF5Service.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
