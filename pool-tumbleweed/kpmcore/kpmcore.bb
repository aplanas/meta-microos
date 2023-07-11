SUMMARY = "KDE Partition Manager core library"
DESCRIPTION = "Library for managing partitions. Common code for KDE Partition Manager and \
other projects."
LICENSE = "GPL-3.0-only"

PV = "23.04.3"

RPM_NAME = "kpmcore-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "8785d236b5c6b7e1187ec1a3ae10ea2fe78533f13767538af91452034d1daadae4bb1c1898b2d59bc092522afee22100fddc0deebdb856d59b47ea6dbe025831"

RPROVIDES:${PN} += "kpmcore"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libkpmcore.so.12 \
libpolkit-qt5-core-1.so.1 \
libstdc++.so.6"

inherit rpm
