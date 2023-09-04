SUMMARY = "Filesearch components for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains filesearch components."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.109.0"

RPM_NAME = "baloo5-file-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "8a3fa8e6c401db6bbbc103a711526e4a69ebd98b1bbb9a3aca5f10cb1b257cc654f3c46b730fd0b6271186fd41407f0f513ddac99e648272aeda11c920b86ccb"

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
