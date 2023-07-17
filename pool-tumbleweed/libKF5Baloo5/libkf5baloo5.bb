SUMMARY = "Core library for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains Baloo's core library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.108.0"

RPM_NAME = "libKF5Baloo5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "3a8348a3189467e1d240aca40f03f02dda203a7e8960a433cab1a5cc7f11daf55b1cbfa4dc5bcdd08dfd27395a78e2892f90e5266cc12925998bda4f41c84826"

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
