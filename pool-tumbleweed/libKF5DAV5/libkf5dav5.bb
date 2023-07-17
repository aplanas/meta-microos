SUMMARY = "Core library for kdav"
DESCRIPTION = "kdav is a library providing a KJob-based implementation of DAV protocols such as \
CardDAV, WebDAV, and CalDAV."
LICENSE = "LGPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5DAV5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "5cc3510d97257e6655b895b090502697ba0716a6b6ba8a9d25b9a9b68fd2d0893dc5c115a4caacf92ef25f8160d24ee6d932ccdd2c453f84e26cd70a40c20bc8"

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
