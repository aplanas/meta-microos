SUMMARY = "Qt5 3D tools"
DESCRIPTION = "Tools for libqt5-qt3d module."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qt3d-tools-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "edaf71dfc672b00a3d4ad752de3dd9d2afff9bf4b77248f97ba0aaadd9643fad89a8d1d71b0c3fdd75b37a2ca2bb6f685235efd7bdae68313e5b822edc93f9bd"

RPROVIDES:${PN} += "libqt5-qt3d-tools \
libqt5-qt3d-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libassimp.so.5()(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
