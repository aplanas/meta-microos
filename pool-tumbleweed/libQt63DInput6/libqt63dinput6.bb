SUMMARY = "Qt 6 3DInput library"
DESCRIPTION = "The Qt 6 3DInput library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt63DInput6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "dcb32d69dfbda1fa1e4b4b5b33d5c17076adb52f5e4df81632b0c4ee0198be73daa9aee047ea1821368991ebea7743337bc5e54b1901eb8d1e93e2b0c2ac2c05"

RPROVIDES:${PN} += "libQt63DInput.so.6 \
libQt63DInput6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
