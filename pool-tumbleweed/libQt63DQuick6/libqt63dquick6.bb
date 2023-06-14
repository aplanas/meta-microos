SUMMARY = "Qt 6 3DQuick library"
DESCRIPTION = "The Qt 6 3DQuick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt63DQuick6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "027f69623c3d879b6822274fdb094e27cb9f7a0d33c8e5817cf02a17923dbb5ba2ef0f1b0ced42072d6737c3ada1e17e5961f2feefd062c9ba036bc8783db2f6"

RPROVIDES:${PN} += "libQt63DQuick.so.6 \
libQt63DQuick6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QmlModels.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
