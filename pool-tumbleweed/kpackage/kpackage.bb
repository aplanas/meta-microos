SUMMARY = "Non-binary asset user-installable package managing framework"
DESCRIPTION = "This framework lets applications to manage user installable packages of non-binary assets."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "kpackage-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "ae0f8e8be2d6b0c789252fdfab3a04b11a48dfb6b50eef25b6a62620a5b346529cd9733032c17e8e5d95c94021274f5cc4128089853c8a3931c5eeca9fca9271"

RPROVIDES:${PN} += "kpackage \
libKF5Package.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
