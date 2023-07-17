SUMMARY = "Plugin framework for desktop services"
DESCRIPTION = "Provides a plugin framework for handling desktop services. Services can \
be applications or libraries. They can be bound to MIME types or handled by \
application specific code."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kservice-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "8569b1600372fa8a9668fd23c69dc974fbb799b005e3a69c8e6f17998c6266fdd6ac3b0ff43948a0b562a4af2f88c6db512bb8f989ae6d46dc03c8524a062866"

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
