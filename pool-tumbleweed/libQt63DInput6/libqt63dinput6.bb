SUMMARY = "Qt 6 3DInput library"
DESCRIPTION = "The Qt 6 3DInput library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt63DInput6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "5d79e9ff6f727d7c4dcfea0293358dd29144b2f03f520195c4b0e3628eedbf8ebcbc4cc1cf9d52f88b4eb6947df5c02cf1a94abaff0d2148f032bcb33203cfda"

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
