SUMMARY = "Filesearch components for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains filesearch components."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.108.0"

RPM_NAME = "baloo5-file-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "604c855f6f1870b38b193020e09f0084a53746aa1bc8fa9072b071a8abb06ed8b0ed2d4d9845e157ce886237923594253732bba62b40da81a215d1f8d84a0bfb"

RPROVIDES:${PN} += "baloo-file \
baloo5-file"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF5Baloo.so.5 \
libKF5BalooEngine.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5FileMetaData.so.3 \
libKF5I18n.so.5 \
libKF5IdleTime.so.5 \
libKF5Solid.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Sql5-sqlite \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
