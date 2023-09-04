SUMMARY = "Core library for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains Baloo's core library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.109.0"

RPM_NAME = "libKF5Baloo5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "e184a5d1a386c6af681140b07461143cbd705485cc23ed9071f26059412cfe85363c7570d50be01f8f0f045150412e9a9ed6f553156079ed5756985c0a60495e"

RPROVIDES:${PN} += "baloo5-lang \
libKF5Baloo.so.5 \
libKF5Baloo5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5BalooEngine.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5FileMetaData.so.3 \
libKF5Solid.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
