SUMMARY = "Async Bluez wrapper library - development files"
DESCRIPTION = "Development files for QBluez Async Bluez wrapper library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "bluez-qt-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "9d31ea380345c176825bf9588c8963ad5c212ad2714ef0132afefae021ff2a00ae998d1165a5b67851343e04297d33b48eee87b5de8df0e0e38a16573b82bf49"

RPROVIDES:${PN} += "bluez-qt-devel bluez-qt-devel(aarch-64) cmake(KF5BluezQt) pkgconfig(KF5BluezQt)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt5Core) libKF5BluezQt6 pkgconfig(Qt5Core) pkgconfig(Qt5DBus) pkgconfig(Qt5Network)"

inherit rpm
