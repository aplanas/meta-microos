SUMMARY = "KIO slave components for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains KIO slave components."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.107.0"

RPM_NAME = "baloo5-kioslaves-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "7d5f8f1e85406c273448073fbcdc1cf93fd1e746503ffd0d814ee94a8b7b696eb103344dd5775ef099f0c7d285d5fed696264ee32afd460452f5432a83f4e259"

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
