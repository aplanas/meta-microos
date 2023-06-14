SUMMARY = "KIO slave components for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains KIO slave components."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.106.0"

RPM_NAME = "baloo5-kioslaves-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "ef6648c77d588682b2818441ec7a64e2520c4ea472e6c36b84d419a54f4ee634ac56570cfdedd0fee5a52bd550374c2b6691158c3dad9ff915b62614a6630558"

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
