SUMMARY = "Qt 6 Quick3DHelpers library"
DESCRIPTION = "The Qt 6 Quick3DHelpers library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DHelpers6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "db9e568512ad3a4d675d875b07f47c40d9ec01aee10c5c066ff907589f7bcee72f609112303e7c9a26b63dec4949b98cf7f78832a991015ec3dc380f83fa175c"

RPROVIDES:${PN} += "libQt6Quick3DHelpers.so.6 \
libQt6Quick3DHelpers6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick3D.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
