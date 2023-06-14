SUMMARY = "Core library for kdav"
DESCRIPTION = "kdav is a library providing a KJob-based implementation of DAV protocols such as \
CardDAV, WebDAV, and CalDAV."
LICENSE = "LGPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5DAV5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "cb3c7775e7ea0fd3c3c271722f990c5ed5eda43f0fc399a6735f730404cdaa7775a80f43f478f400d93fba131b368cd63d25ff7dade6a83aae2d193bd3b06549"

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
