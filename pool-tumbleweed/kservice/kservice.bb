SUMMARY = "Plugin framework for desktop services"
DESCRIPTION = "Provides a plugin framework for handling desktop services. Services can \
be applications or libraries. They can be bound to MIME types or handled by \
application specific code."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kservice-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "90cb7ea017bd25134290c087fed1af37eef864d3825c59dd2a2808e0f9c3392039f75f4913598d49f339cc4690f59d322f3dcbe58258cd7c842eafc9c1a0c311"

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
