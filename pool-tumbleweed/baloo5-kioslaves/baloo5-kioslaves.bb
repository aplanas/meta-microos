SUMMARY = "KIO slave components for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains KIO slave components."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.109.0"

RPM_NAME = "baloo5-kioslaves-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "d28829eeaa1c9abc62eb4f71232b7b96824eb7f1ab90bdf1e2c8095895608fbaf3c033086f2bc86c2557bdad086524d7eaf5213b68e676d3aba5aebe42ed8b01"

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
