SUMMARY = "Qt 6 3DLogic library"
DESCRIPTION = "The Qt 6 3DLogic library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt63DLogic6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "59215413aeedab67938face491967ebc4cbd72eb432ca9aff5d7350a5d6121b1632123800798bae7100d6848c764a08ef1c90fd775253443fd591ec07148d9df"

RPROVIDES:${PN} += "libQt63DLogic.so.6 \
libQt63DLogic6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
