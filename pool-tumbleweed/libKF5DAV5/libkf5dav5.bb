SUMMARY = "Core library for kdav"
DESCRIPTION = "kdav is a library providing a KJob-based implementation of DAV protocols such as \
CardDAV, WebDAV, and CalDAV."
LICENSE = "LGPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5DAV5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "2c19d91eeec47077e760ef063cb48ec0ceb76a7a3715cd24d01318e0d981e71b20cae1c37119a74ab1996cc4d82fa1f7d271b79b604ab2cfda5abb4b34dfa1a1"

RPROVIDES:${PN} += "libKF5DAV.so.5 \
libKF5DAV5"

RDEPENDS:${PN} += "/sbin/ldconfig \
kdav \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
