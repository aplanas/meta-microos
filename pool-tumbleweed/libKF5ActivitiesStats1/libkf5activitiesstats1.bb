SUMMARY = "Library for KDE's Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager."
LICENSE = "LGPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5ActivitiesStats1-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "bee91cf748d029abf9da47b043c169dfadcdc469cd66892a4363a3912e05d9c6ace825432caef8505123c082177c6c2c18ac0477cdfc6efebe42ad022f184060"

RPROVIDES:${PN} += "libKF5ActivitiesStats.so.1 \
libKF5ActivitiesStats1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Activities.so.5 \
libKF5ConfigCore.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Sql.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
