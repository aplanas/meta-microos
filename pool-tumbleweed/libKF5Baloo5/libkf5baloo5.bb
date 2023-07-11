SUMMARY = "Core library for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains Baloo's core library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.107.0"

RPM_NAME = "libKF5Baloo5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "8944524955e16106e0b0a17b56316325217baf435c97b9b1eff254e45848a1e924afa1d6b6836ce73feeb360bbfdcd335a82d977f7a539f3b7f87baf6dd76ec8"

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
