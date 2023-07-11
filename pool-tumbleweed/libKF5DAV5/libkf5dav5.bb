SUMMARY = "Core library for kdav"
DESCRIPTION = "kdav is a library providing a KJob-based implementation of DAV protocols such as \
CardDAV, WebDAV, and CalDAV."
LICENSE = "LGPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5DAV5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "5592cf9d7d50e2e4bb290344204c0623cc30a6f2540289f4965b544c18ea51831283560797362bfeced2fdcc2793788a5992efcd94f7424eeb20aae34cbf9a67"

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
