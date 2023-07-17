SUMMARY = "KIO slave components for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains KIO slave components."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.108.0"

RPM_NAME = "baloo5-kioslaves-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "4beb6c084903896347786cff02c58a721d465c4d8c28aa05beddd9e5cff36542a9bc99041e8bda09cd3f635345ee8905b206e76f49169292cfc3b2814d3f4f71"

RPROVIDES:${PN} += "baloo5-kioslaves"

RDEPENDS:${PN} += "kded \
ld-linux-aarch64.so.1 \
libKF5Baloo.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5FileMetaData.so.3 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
